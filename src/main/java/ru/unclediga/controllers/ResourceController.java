package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
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
        if(1 == 1) throw new RuntimeException("Error ");
        return "resource_add";
    }

    @ExceptionHandler(Exception.class)
    public String handleError(){
        return "controller_error";
    }

    @RequestMapping("/review")
    public String review(@ModelAttribute Resource resource) {
        System.out.println("Invoking method review()");
        return "resource_review";
    }

    @RequestMapping("/request")
    @ResponseBody
    public String request(@RequestBody String resource) {
        System.out.println("Invoking method request()");
        System.out.println(resource);
        return "The Request for name has been sent";
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
    public String save(@ModelAttribute Resource resource, SessionStatus status) {
        System.out.println("Invoking method save()");
        System.out.println(resource);
        status.setComplete();
        return "redirect:/resource/add";
    }
}
