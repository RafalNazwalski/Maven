package org.wwsis.lab1.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wwsis.lab1.model.Student;

@Controller
public class FirstFormController {

	@RequestMapping("/firstForm")
	public String getForm(Model model) {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		model.addAttribute("dateTime", "Aktualna data i godzina: " + dateFormat.format(date));
		model.addAttribute("formName", "Moj formularz");
		model.addAttribute("student", new Student());

		return "firstForm";
	}

	@PostMapping("/firstForm")
	public String postForm(Model model, Student student) {
		model.addAttribute("studentFirstName", student.getFirstName());
		model.addAttribute("studentLastName", student.getLastName());
		model.addAttribute(arg0)
		return "secondForm";
	}
}