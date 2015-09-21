package com.eintern.spring.hellospringjersey.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eintern.spring.hellospringjersey.data.entity.MultiGreeting;
import com.eintern.spring.hellospringjersey.data.entity.Student;
import com.eintern.spring.hellospringjersey.data.entity.Teacher;
import com.eintern.spring.hellospringjersey.model.delegate.SchoolDelegate;

@Controller
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private SchoolDelegate schoolDelegate;
	
	/*@RequestMapping(method=RequestMethod.GET)
	public String getGreeting(Model model) {
		model.addAttribute("greeting", greetingDelegate.getGreeting());
		return "greeting";
	}*/
	
	@RequestMapping(value="/request",method=RequestMethod.GET)
	public String getTeacherForm(Model model) {
		Teacher t = new Teacher();
		t.getStudents().add(new Student());
		t.getStudents().add(new Student());
		model.addAttribute("teacher", t);
		return "teacherForm";
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String submit(@Valid Teacher teacher, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors())
			return "teacherForm";
		schoolDelegate.addTeacher(teacher);
		model.addAttribute("teacher", teacher);
		return "customTeacher";
	}
}
