package com.core.savetravel.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.core.savetravel.models.Travel;
import com.core.savetravel.services.TravelService;


@Controller
public class MainController {
    @Autowired
    TravelService travelService; 

    @GetMapping("/")
    public String index(@ModelAttribute("travel") Travel travel, Model model) { 
        List<Travel> travels = travelService.allTravels();
        model.addAttribute("travels", travels);
        return "index.jsp"; 
    }

    @PostMapping("/addTravel")
    public String addTravel(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) { // Corrected model attribute name to match HTML form
        if (result.hasErrors()) {
            List<Travel> travels = travelService.allTravels();
            model.addAttribute("travels", travels);
            return "index.jsp";
        }
        travelService.addTravel(travel);
        return "redirect:/"; 
    }
    
    @GetMapping("/edit/{id}")
	public String editBurger(@PathVariable("id") Long id, @ModelAttribute("travel") Travel travel, Model model) {
		model.addAttribute("travel", travelService.findTravel(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String updateBurger(@Valid @ModelAttribute("burger") Travel travel, BindingResult result, @PathVariable("id") Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("travel", travel);
			return "index.jsp";
		}
		travelService.updateTravel(travel);
		return "redirect:/";
	}
	
	@GetMapping("/deleteTravel/{id}")
	public String deleteTravel(@PathVariable("id") Long id) {
	    travelService.deleteTravel(id);
	    return "redirect:/";
	}

	}

