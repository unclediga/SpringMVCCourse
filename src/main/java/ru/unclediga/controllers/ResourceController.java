package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unclediga.data.entities.Resource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping("/add")
    public String add(Model model) {
        List<String> options = new LinkedList<>(Arrays.asList("Material", "Other", "Staff"));
        model.addAttribute("typeOptions", options);
        model.addAttribute("resource", new Resource());
        return "resource_add";
    }

    @RequestMapping(path = "/save")
    public String save(@ModelAttribute Resource resource) {
        System.out.println(resource);
        return "resource_add";
    }
}
