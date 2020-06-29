package ru.unclediga.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import ru.unclediga.data.validators.ProjectValidator;

import java.util.Date;

@ControllerAdvice(annotations = Controller.class)
public class GlobalControllerAdvice {

    @ModelAttribute("currentDate")
    public Date getCurrentDate(){
        return new Date();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
//        binder.addValidators(new ProjectValidator());
    }

    @ExceptionHandler(NullPointerException.class)
    public String handleError(){
        return "controller_error";
    }
}
