package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller // annotation bean controller 
public class HomeController  {

   
    @GetMapping("/") // annotation for get endpoint "/" -> (start page)
    public String home() {
        return "home";  // return --> home.html
    }
    
}
