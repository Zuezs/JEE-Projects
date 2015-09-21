package com.eintern.spring.hellospringjersey.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.eintern.spring.hellospringjersey.data.entity.Greeting;
import com.eintern.spring.hellospringjersey.data.entity.MultiGreeting;
import com.eintern.spring.hellospringjersey.model.delegate.MultiGreetingDelegate;

@Controller
@RequestMapping("/mgreeting")
public class MultiGreetingController {
	@Autowired
	private MultiGreetingDelegate greetingDelegate;
	
	/*@RequestMapping(method=RequestMethod.GET)
	public String getGreeting(Model model) {
		model.addAttribute("greeting", greetingDelegate.getGreeting());
		return "greeting";
	}*/
	
	@RequestMapping(value="/request",method=RequestMethod.GET)
	public String getGreetingForm(@RequestParam("size") int size, Model model) {
		model.addAttribute("multiGreeting", new MultiGreeting(size));
		return "multiGreetingForm";
	}
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public String submit(@Valid MultiGreeting greeting, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors())
			return "multiGreetingForm";
		greetingDelegate.saveGreeting(greeting);
		model.addAttribute("customMultiGreeting", greeting);
		return "customMultiGreeting";
	}
}
