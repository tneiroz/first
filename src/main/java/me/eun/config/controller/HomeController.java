package me.eun.config.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {
	@RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
	 public String home(HttpServletRequest request) {
		 String name = request.getParameter("username");
		 System.out.println(name);
		 return "welcome"; 
}
}
