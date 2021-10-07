package com.uiproject_go_green.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {

    @GetMapping("/about")
    public String about(){

        return "about.html";
    }
    
    @GetMapping("/contact")
    public String contact(){

        return "contact.html";
    }

    @GetMapping("/fruit")
    public String fruit(){

        return "fruit.html";
    }

    @GetMapping("/index")
    public String index(){

        return "index.html";
    }

    @GetMapping("/testimonial")
    public String testimonial(){

        return "testimonial.html";
    }



}
