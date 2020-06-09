package ru.unclediga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.unclediga.data.entities.Project;
import ru.unclediga.data.services.ProjectService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

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

    @RequestMapping("/add")
    public String addProject(HttpSession session) {
        System.out.println("invoke addProject");
        session.setAttribute("token", "12345");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(@ModelAttribute Project project) {
        System.out.println("invoke saveProject");
        System.out.println(project);
        return "project_add";
    }
}
