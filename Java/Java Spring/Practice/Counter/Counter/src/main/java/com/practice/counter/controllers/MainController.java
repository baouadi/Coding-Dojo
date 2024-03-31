package com.practice.counter.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController{
	@RequestMapping("/")
	public String index(HttpSession session) {
	    if (session.getAttribute("count") == null) {
	        
	        session.setAttribute("count", 1);
	    }
	    else {
	        int count = (int) session.getAttribute("count");
	        session.setAttribute("count", count + 1);
	    }
	    return "index.jsp";
	}

	
	@RequestMapping("/count")
	public String counter() {
		return "count.jsp";
	}
}
