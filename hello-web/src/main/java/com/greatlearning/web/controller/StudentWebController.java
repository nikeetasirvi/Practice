package com.greatlearning.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// this project did not neede lib folder as it is a maven project and we have added dependencies,
// but it was not working so i added the lib folder from employee registration

@Controller
@RequestMapping("/student")
public class StudentWebController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
