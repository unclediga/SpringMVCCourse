package ru.unclediga.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.unclediga.data.entities.Project;
import ru.unclediga.data.entities.Sponsor;
import ru.unclediga.data.services.ProjectService;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String goHomeAgain(Model model, @ModelAttribute("project") Project project) {
        model.addAttribute("currentProject", project);
        return "home";
    }


//    @RequestMapping("/")
//    public String goHome(Model model) {
//        final Project project = new Project();
//        project.setName("First Project");
//        project.setSponsor(new Sponsor("Nasa", "123-23-24", "info@nasa.gov"));
//        project.setDescription("This is a simple project sponsored by NASA");
//        model.addAttribute("currentProject", project);
//        return "welcome";
//    }
}
