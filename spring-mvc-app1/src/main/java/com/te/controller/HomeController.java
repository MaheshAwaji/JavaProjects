package com.te.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model){
		model.addAttribute("name", "Mahesh Awaji");
		System.out.println("this is home url ");
		return "index";
	}
	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("this is about url ");
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("about");
		modelAndView.addObject("name", "Virat Kohli");
		
		LocalDateTime dateTime=LocalDateTime.now();
		modelAndView.addObject("time", dateTime);
		return modelAndView;
	}

}
