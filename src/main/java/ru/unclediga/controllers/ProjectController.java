package ru.unclediga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String saveProject(HttpServletRequest request,
                              HttpSession session,
                              @RequestParam("name") String name,
                              @RequestParam("authorized_funds") Double funds) {
        System.out.println("invoke saveProject");
        System.out.println("request.getParam(name) = " + request.getParameter("name"));
        System.out.println("@RequestParam(name) = " + name);
        System.out.println("@RequestParam(funds) = " + funds + " " + funds.getClass());
        System.out.println("session = " + session.getAttribute("token"));
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiYearProject() {
        System.out.println("invoke saveMultiProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi", "special"})
    public String saveTypeProject() {
        System.out.println("invoke saveSpecialProject");
        return "project_add";
    }
}
