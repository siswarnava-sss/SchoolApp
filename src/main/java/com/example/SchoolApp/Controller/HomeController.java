package com.example.SchoolApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = {"","/", "home"})
    public String displayHomepage(Model model){
        model.addAttribute("username","Swarnava");
        return "home.html";
    }
}
