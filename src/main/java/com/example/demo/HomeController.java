package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model

@Controller
public class HomeController {
    @GetMapping("/songform")
    public string loadFlormPage(Model model){
        model.addAttribute("song", new Song);
        return "songform";
    }
    @GetMapping("/songform")
    public String loadForm


