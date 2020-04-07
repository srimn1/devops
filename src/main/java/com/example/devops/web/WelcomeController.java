package com.example.devops.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeController {

	@RequestMapping()
	public String welcome(Model model) {
		model.addAttribute("course", "DevOps");
		return "index";
	}

}
