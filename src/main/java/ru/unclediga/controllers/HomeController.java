package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unclediga.data.entities.Project;
import ru.unclediga.data.entities.Sponsor;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String goHome(Model model) {
        final Project project = new Project();
        project.setName("First Project");
        project.setSponsor(new Sponsor("Nasa","123-23-24","info@nasa.gov"));
        project.setDescription("This is a simple project sponsored by NASA");
        model.addAttribute("currentProject", project);
        return "welcome";
    }
}
