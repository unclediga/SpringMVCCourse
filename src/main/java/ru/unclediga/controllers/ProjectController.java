package ru.unclediga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.unclediga.data.entities.Project;
import ru.unclediga.data.services.ProjectService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("/find/{projectId}")
    public @ResponseBody Project findProjectObject(Model model, @PathVariable("projectId") Long projectId) {
        return projectService.find(projectId);
    }

    @RequestMapping("/{projectId}")
    public String findProject(Model model, @PathVariable("projectId") Long projectId) {
        Logger logger = Logger.getGlobal();
        logger.info("prj ID = " + projectId);
        model.addAttribute("project", projectService.find(projectId));
        return "project";
    }

    @RequestMapping("/find")
    public String find(Model model) {
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addProject(Model model) {
        model.addAttribute("types", new ArrayList<>(Arrays.asList(" ", "Single Year", "Multi Year")));
        model.addAttribute("project", new Project());
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@Valid @ModelAttribute Project project, Errors errors, RedirectAttributes attributes) {
        if (errors.hasErrors()) {
            System.out.println("The project did not validate.");
            for (ObjectError o : errors.getAllErrors()) {
                System.out.println("err: " + o.getObjectName() + " -> "  + o.getDefaultMessage());
            }
            return "project_add";
        } else {
            System.out.println("The project is valid.");
        }
        System.out.println("invoke saveProject");
        System.out.println(project);
        project.setProjectId(55L);
        projectService.save(project);
        attributes.addFlashAttribute("project", project);
        return "redirect:/";
    }
}
