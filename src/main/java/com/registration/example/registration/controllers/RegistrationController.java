package com.registration.example.registration.controllers;

import org.springframework.ui.Model;
import com.registration.example.registration.models.User;
import com.registration.example.registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RestController
public class RegistrationController {
    @RequestMapping("/registration-page")
    public ModelAndView controller() {
        ModelAndView view = new ModelAndView();
        view.setViewName("registration-page");
        return view;
    }

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {
        userRepository.save(user);
        model.addAttribute("user", user);
        return "result";
    }
}
