package org.wwsis.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wwsis.lab1.model.Student;

@Controller
public class FirstFormController {

	@RequestMapping("/firstForm")
	public String getForm(Model model) {
		model.addAttribute("formName", "Moj formularz");
		model.addAttribute("student", new Student());
		return "firstForm";
	}

	@PostMapping("/firstForm")
	public String postForm(Model model, Student student) {
		model.addAttribute("studentFirstName", student.getFirstName());
		model.addAttribute("studentLastName", student.getLastName());
		return "secondForm";
	}
}