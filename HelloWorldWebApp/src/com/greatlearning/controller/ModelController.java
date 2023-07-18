package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {

	/*
	 * Model,ModelMap and ModelAndView to define a model in spring mvc
	 * Model--> used to add attribute to the model
	 * ModelMap--> defines a holder for model attributes and is primarily designed for adding attributes
	 * ModelAndView--> holder for model and a view
	 * 
	 */
	
	@RequestMapping("/modelURL")
	public String returnModelMessage(ModelMap model) { //you can also use Model instead of ModelMap here as used in employeeRegistration project
		model.addAttribute("message","Nikita is learning to use model");//name and value
		return "modelView";
	}
}
