package com.gumbak.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.gumbak.model.ChatMessage;
import com.gumbak.model.ChatMessagesList;
import com.gumbak.model.User;

@Controller
@RequestMapping(value = "chatroom")
public class ChatroomController {
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  goToChatroom(HttpServletRequest request) {
		ChatMessagesList chatMessagesList = (ChatMessagesList) request.getSession().getAttribute("chatMessagesList");
		if (chatMessagesList == null) {
			chatMessagesList = new ChatMessagesList();
			request.getSession().setAttribute("chatMessagesList", chatMessagesList);
		}
		return new ModelAndView("chatroom", "chatMessagesList", chatMessagesList);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String  addMessage(HttpServletRequest request, @ModelAttribute("chatMessage") ChatMessage chatMessage) {
		User user = (User) request.getSession().getAttribute("user");
		chatMessage.setAuthor(user);
		
		ChatMessagesList chatMessagesList = (ChatMessagesList) request.getSession().getAttribute("chatMessagesList");
		chatMessagesList.addMessages(chatMessage);
		
		return "redirect:/chatroom";
	}
}
