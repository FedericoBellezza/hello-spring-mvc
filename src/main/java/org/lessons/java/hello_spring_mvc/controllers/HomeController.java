package org.lessons.java.hello_spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("surname", "Bellezza");
        model.addAttribute("email", "federico@gmail.com");
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
    
}
