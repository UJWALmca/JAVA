package com.example.STUDENT_MANAGEMENT.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.STUDENT_MANAGEMENT.ENTITY.*;
import com.example.STUDENT_MANAGEMENT.SERVICE.*;

@Controller
public class teacher_controller {
	
	@Autowired
	teacherservice  teachservice;

	
	@GetMapping("/teachers")
	public String getTeacher(Model model) {
		List<Teacher> teacher = teachservice.getAll();
		model.addAttribute("teachers",teacher);
		return "teachers";
	}
	@GetMapping("/teachers/add")
	public String viewaddstudent(Model model) {
		Teacher teacher = new Teacher();
	    model.addAttribute("teacher", teacher);
		return "add-teacher";
	}
	
	@PostMapping("/teachers/add")
    public String addCourse(Teacher teacher) {
		teachservice.saveAll(teacher);
        return "redirect:/teachers";
    }
	
}
