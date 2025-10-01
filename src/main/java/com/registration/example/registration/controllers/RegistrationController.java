package com.registration.example.registration.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegistrationController {
    @RequestMapping("/registration-page")
    public ModelAndView controller() {
        ModelAndView view = new ModelAndView();
        view.setViewName("registration-page");
        return view;
    }

    @PostMapping("/register")
    public String register() {
        return "Successfully Registered!";
    }
}
