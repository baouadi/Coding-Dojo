package com.core.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class MainController {

    @GetMapping
    public String index() {
        return "index.jsp";
    }

    @PostMapping("/process")
    public String processForm(
            @RequestParam("number") int number,
            @RequestParam("city") String city,
            @RequestParam("realPerson") String realPerson,
            @RequestParam("hobby") String hobby,
            @RequestParam("livingThing") String livingThing,
            @RequestParam("something") String something,
            HttpSession session) {
        String fortune = String.format("In %d years you will live in %s with %s as your roommate, %s. "
                        + "The next time you see a %s, you will have good luck. Also, %s",
                number, city, realPerson, hobby, livingThing, something);

        session.setAttribute("fortune", fortune);

        return "redirect:/omikuji/show";
    }

    @GetMapping("/show")
    public String showResult(HttpSession session, Model model) {
        String fortune = (String) session.getAttribute("fortune");
        model.addAttribute("fortune", fortune);
        return "show.jsp";
    }

    @GetMapping("/")
    public String index1() {
        return "redirect:/omikuji";
    }
}

