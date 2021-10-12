package com.uiproject_go_green.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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


public String subscribe(String name, String email){
        return name + email;
}

public void saveEmail(String name, String email){
        SQLcontroller sqLcontroller = new SQLcontroller();
        sqLcontroller.scriptCommand("insert into gogreen.subscribers(name, email)values(" + name + email + ")");
}

}
