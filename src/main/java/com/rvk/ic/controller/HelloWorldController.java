package com.rvk.ic.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Hello World, Spring MVC @ Javatpoint";
		return new ModelAndView("hello", "message", message);
	}
/*	@RequestMapping("/success")
	public ModelAndView goToHome() {
		String message = "welcome , your request Added successfully";
		return new ModelAndView("success", "message", message);
	}*/
}
