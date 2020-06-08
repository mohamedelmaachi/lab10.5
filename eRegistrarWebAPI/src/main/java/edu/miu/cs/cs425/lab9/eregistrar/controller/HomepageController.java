package edu.miu.cs.cs425.lab9.eregistrar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomepageController {

    @GetMapping(value = {"/", "/index", "/home", "/eregistrar/home"})
    public String showHomepage() {
        return "home/index";
    }

}