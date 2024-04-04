package com.practice.burgertracker1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.burgertracker1.models.Burger;
import com.practice.burgertracker1.services.BurgerService;

import jakarta.validation.Valid;
import java.util.List; 

@Controller
public class BurgerController {

    private final BurgerService burgerService;

    public BurgerController(BurgerService burgerService) {
        this.burgerService = burgerService;
    }
    
    @GetMapping("/")
    public String newBurger(Model model) {
        model.addAttribute("burger", new Burger());
        model.addAttribute("burgers", burgerService.allBurger()); 
        return "index"; 
    }

    @PostMapping("/")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "index"; 
        }
        burgerService.createBurger(burger);
        return "redirect:/"; 
    }
}
