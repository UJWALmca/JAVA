package com.example.STUDENT_MANAGEMENT.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.STUDENT_MANAGEMENT.ENTITY.*;
import com.example.STUDENT_MANAGEMENT.SERVICE.StudentService;

@Controller
public class Student_controller {
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/students")
	public String getstudent(Model model) {
		List<Student> student = studentservice.getAllStudents();
		model.addAttribute("students",student);
		return "students";
	}
	
	@GetMapping("/students/add")
	public String viewaddstudent() {
		return "add-students";
	}
	
	@PostMapping("/students/add")
	public String addStudent(Student student) {
		studentservice.savestudents(student);
		return "redirect:/students";
	}

}
