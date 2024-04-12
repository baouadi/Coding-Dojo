package com.fullspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fullspring.models.LoginUser;
import com.fullspring.models.User;
import com.fullspring.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
                           @RequestParam("confirmPassword") String confirmPassword,
                           BindingResult result, Model model, HttpSession session) {

        if (!newUser.getPassword().equals(confirmPassword)) {
            result.rejectValue("confirmPassword", "error.user", "Passwords do not match");
        }

        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }

        User registeredUser = userService.register(newUser, confirmPassword, result);

        if (registeredUser == null) {
            model.addAttribute("registrationError", "Registration failed. Please try again.");
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }

        session.setAttribute("userId", registeredUser.getId());
        return "redirect:/welcome";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result,
                        Model model, HttpSession session) {

        User user = userService.login(newLogin, result);

        if (user == null) {
            result.rejectValue("email", "error.user", "Invalid email or password");
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }

        session.setAttribute("userId", user.getId());
        return "redirect:/welcome";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
   	 session.setAttribute("userId", null);
   	 return "redirect:/";
    }
    
    @GetMapping("/welcome")
    public String welcome(Model model, HttpSession session) {
   	 Long userId = (Long) session.getAttribute("userId");
   	 if(userId==null) {
   		 return "redirect:/";
   	 }
   	 User user = userService.getUserById(userId);
   	 model.addAttribute("user",user);
   	 return "welcome.jsp";
    }

}

