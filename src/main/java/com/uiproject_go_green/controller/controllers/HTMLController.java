package com.uiproject_go_green.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HTMLController {

    String mail ="";


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

@GetMapping("/eSub")
public String eSub(@RequestParam String email){
    System.out.println(email);
        return email;
}

@GetMapping("/contact")
    public String pushButton(@RequestParam String email) {
        mail = email;
        saveEmail(mail);
        return "index.html";
    }



public void saveEmail( String email){
        SQLcontroller sqLcontroller = new SQLcontroller();
        sqLcontroller.scriptCommand("insert into gogreen.subscribers(name, email)values("  + email + ")");
}

}
