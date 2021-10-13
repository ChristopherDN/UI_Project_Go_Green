package com.uiproject_go_green.controller.controllers;

import com.uiproject_go_green.controller.DBManager.DBManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
public class HTMLController {
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    String mail ="";
    int i = 0;


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

/*@GetMapping("/eSub")
public String eSub(@RequestParam String email){
        return email;
}*/

@GetMapping("/av")
    public String pushButton(@RequestParam String email) {
        if(email == null) {
            System.out.println("Fail!!!!");
        }else {
            if (i == 0){
               // i++;
                mail = email;
                saveEmail(mail);
            }
        }
        return "index.html";
    }



public void saveEmail(String email){
    SQLcontroller sqLcontroller = new SQLcontroller();
    sqLcontroller.scriptCommand("insert into GoGreen.subscribers(email) values(\"" + email + "\")");
}

}
