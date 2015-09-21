package com.eintern.spring.hellospringjersey.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eintern.spring.hellospringjersey.data.entity.Greeting;
import com.eintern.spring.hellospringjersey.model.delegate.GreetingDelegate;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
	@Autowired
	private GreetingDelegate greetingDelegate;
	
	@RequestMapping(method=RequestMethod.GET)
	public String getGreeting(Model model) {
		model.addAttribute("greeting", greetingDelegate.getGreeting());
		return "greeting";
	}
	
	@RequestMapping(value="/request",method=RequestMethod.GET)
	public String getGreetingForm(Model model) {
		model.addAttribute("greeting", new Greeting());
		return "greetingForm";
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String submit(@Valid Greeting greeting, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors())
			return "greetingForm";
		greetingDelegate.saveGreeting(greeting);
		model.addAttribute("customGreeting", greeting);
		return "customGreeting";
	}
}
