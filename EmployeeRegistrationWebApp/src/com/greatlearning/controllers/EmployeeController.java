package com.greatlearning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel) {
		Employee employee = new Employee();
		theModel.addAttribute("employeeModel",employee);
		return "employeeForm";
	}
	
	//@ModelAttribute annotation refer to the property of the model object and is used to prepare the model data
	//this annotation bind a method variable or the model object to a named model attribute
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeModel") Employee employee) {
		return "registrationConfirmation";
	}
}
