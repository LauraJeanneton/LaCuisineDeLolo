package fr.webapp.cuisine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CuisineController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }
}
