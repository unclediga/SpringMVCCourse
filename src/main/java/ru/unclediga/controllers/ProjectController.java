package ru.unclediga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.unclediga.data.services.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @RequestMapping("/find")
    public String find(Model model){
        model.addAttribute("projects", projectService.findAll());
        return "projects";
    }

    @RequestMapping("/add")
    public String addProject(){
        System.out.println("invoke addProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveProject(){
        System.out.println("invoke saveProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi"})
    public String saveMultiYearProject(){
        System.out.println("invoke saveMultiProject");
        return "project_add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, params = {"type=multi", "special"})
    public String saveTypeProject(){
        System.out.println("invoke saveSpecialProject");
        return "project_add";
    }
}
