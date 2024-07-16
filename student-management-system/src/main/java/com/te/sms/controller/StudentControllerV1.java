package com.te.sms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.te.sms.dto.LoginDto;
import com.te.sms.dto.StudentDto;
import com.te.sms.service.SmsService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class StudentControllerV1 {
	private final SmsService smsService;
	
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(path = "/login",method = RequestMethod.POST)
	public String login(@ModelAttribute LoginDto loginDto,Model model) {
		
		boolean checkPassword = smsService.checkPassword(loginDto);
		if (checkPassword) {
			model.addAttribute("message", loginDto.getRollnumber());
			return "home";
		}else {
			model.addAttribute("message", "Login Unsuccessful");
			return "login";
		}
		
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(path = "/register",method = RequestMethod.POST )
	public String register(HttpServletRequest request) {
		String rollnumber = request.getParameter("rollnumber") ;
		String email = request.getParameter("email");
		String age = request.getParameter("age");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		StudentDto studentDto= StudentDto.builder().studentRollNumber(rollnumber)
				.studentAge(age).studentUsername(username).studentPassword(password).studentEmail(email).build();
		smsService.register(studentDto);
		return "home";
		
	}

}
