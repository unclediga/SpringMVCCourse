package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ru.unclediga.data.entities.Resource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/resource")
@SessionAttributes("resource")
public class ResourceController {

    @RequestMapping("/add")
    public String add(Model model) {
        System.out.println("Invoking method add()");
        return "resource_add";
    }

    @RequestMapping("/review")
    public String review(@ModelAttribute Resource resource) {
        System.out.println("Invoking method review()");
        return "resource_review";
    }

    @ModelAttribute("resource")
    public Resource getResource() {
        System.out.println("Adding a new resource to the model");
        return new Resource();
    }

    @ModelAttribute("typeOptions")
    public List<String> getTypes() {
        return new LinkedList<>(Arrays.asList("Material", "Other", "Staff"));
    }

    @ModelAttribute("radioOptions")
    public List<String> getRadios() {
        return new LinkedList<>(Arrays.asList("Hours", "Piece", "Tons"));
    }

    @ModelAttribute("checkOptions")
    public List<String> getChecks() {
        return new LinkedList<>(Arrays.asList("Lead Time", "Special Rate", "Requires Approval"));
    }

    @RequestMapping(path = "/save")
    public String save(@ModelAttribute Resource resource) {
        System.out.println("Invoking method save()");
        System.out.println(resource);
        return "redirect:/resource/add";
    }
}
