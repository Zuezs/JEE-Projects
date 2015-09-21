package com.allen.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.allen.spring.model.Student;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student" , "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb")Student student, ModelMap model){
		
		model.addAttribute("id", student.getId());
		model.addAttribute("firstName", student.getFirstName());
		model.addAttribute("lastName", student.getLastName());
		model.addAttribute("email", student.getEmail());
		model.addAttribute("address", student.getAddress());
		model.addAttribute("age", student.getAge());
		model.addAttribute("grade", student.getGrade());
		model.addAttribute("sex", student.getSex());
		
		return "result";
	}
	
}
