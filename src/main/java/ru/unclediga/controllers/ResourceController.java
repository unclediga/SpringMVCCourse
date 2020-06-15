package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.unclediga.data.entities.Resource;

@Controller
@RequestMapping("/resource")
public class ResourceController {

    @RequestMapping("/add")
    public String add() {
        return "resource_add";
    }

    @RequestMapping(path = "/save")
    public String save() {
        System.out.println("invoking the save() method");
        return "resource_add";
    }
}
