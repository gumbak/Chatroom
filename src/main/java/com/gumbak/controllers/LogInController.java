package com.gumbak.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gumbak.model.User;

@Controller
@RequestMapping(value = {"/", "/login"})
public class LogInController {
	@RequestMapping(method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void executeLogIn(@ModelAttribute("user") User user) {
		return;
	}
}
