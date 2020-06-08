package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.unclediga.data.entities.Project;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String goHome(Model model) {
        final Project project = new Project();
        project.setName("First Project");
        project.setSponsor("Nasa");
        project.setDescription("This is a simple project sponsored by NASA");
        model.addAttribute("currentProject", project);
        return "home";
    }
}
