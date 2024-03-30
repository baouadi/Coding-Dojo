package com.practice.hellohuman;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController{
	@RequestMapping("/")
	public String index(@RequestParam(value="name" , required=false) String nameQuery,
			@RequestParam(value="last_name" , required=false) String lastNameQuery) {
		if (nameQuery==null || lastNameQuery==null) {
			return "Hello Human";
		}
		return "Hello "+ nameQuery+" "+lastNameQuery;
	}
}
