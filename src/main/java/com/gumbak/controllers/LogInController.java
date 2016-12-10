package com.gumbak.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gumbak.model.User;

@Controller
@RequestMapping(value = {"/", "/login"})
public class LogInController {
	@RequestMapping(method = RequestMethod.GET)
	public String goToLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String executeLogin(HttpServletRequest request, @ModelAttribute("user") User user) {
		request.getSession().setAttribute("user", user);
		return "redirect:/chatroom";
	}
}
