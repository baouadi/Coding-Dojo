package com.core.dojoandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.core.dojoandninjas.models.Dojo;
import com.core.dojoandninjas.models.Ninja;
import com.core.dojoandninjas.services.DojoService;
import com.core.dojoandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	 @Autowired
	    NinjaService ninjaService;
	    @Autowired
	    DojoService dojoService;

	    @GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("dojos", dojoService.allDojos());
	        List<Ninja> ninjas = ninjaService.allNinjas();
	        model.addAttribute("ninjas", ninjas);
	        return "index.jsp";
	    }

	    @GetMapping("/dojo/new")
	    public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
	        return "newdojo.jsp";
	    }
	    
	    @PostMapping("/dojo/new")
	    public String addDojo(@ModelAttribute("dojo") Dojo dojo) {
	        dojoService.addDojo(dojo);
	        return "redirect:/";
	    }
	    
	    @GetMapping("/ninja/new")
	    public String newNinja(Model model) {
	        model.addAttribute("dojos", dojoService.allDojos());
	        model.addAttribute("ninja", new Ninja());
	        return "newninja.jsp";
	    }
	    
	    @PostMapping("/ninja/new")
	    public String createNewNinja(
	            Model model,
	            @Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	        if (result.hasErrors()) {
	            model.addAttribute("dojos", dojoService.allDojos());
	            return "newninja.jsp";
	        } else {
	            ninjaService.save(ninja);
	            return "redirect:/";
	        }
	    }
	}

