package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//stereotype annotation of @Component
@Controller
public class HelloController {
	
	//adding the request mapping ---> URL
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}

	@RequestMapping("/")
	public String giveWelcomeMessage() {
		return "welcome";
	}
	
	@RequestMapping("/goodbye")
	public String giveGoodByeMessage() {
		return "goodbye";
	}
}
