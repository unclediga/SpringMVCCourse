package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {
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
