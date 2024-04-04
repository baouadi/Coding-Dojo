package com.practice.burgertracker.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.practice.burgertracker.models.Burger;
import com.practice.burgertracker.repositories.BurgerRepository;
import com.practice.burgertracker.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {

    @Autowired
    private BurgerService burgerService;

    @Autowired
    private BurgerRepository burgerRepository;

    @GetMapping("/")
    public String home(Model model) {
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        model.addAttribute("burger", new Burger());
        return "index";
    }

    @PostMapping("/addBurger")
    public String addBurger(@ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Burger> burgers = burgerService.allBurgers();
            model.addAttribute("burgers", burgers);
            return "index";
        }
        burgerService.addBurger(burger);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editBurger(@PathVariable("id") Long id, Model model) {
        Optional<Burger> burger = burgerService.findBurger(id);
        model.addAttribute("burger", burger);
        return "edit";
    }
    
    @PostMapping("/edit/{id}")
    public String updateBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, @PathVariable("id") Long id, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burger", burger);
            return "edit";
        }
        burgerService.updateBurger(burger);
        return "redirect:/";
    }

 
}



