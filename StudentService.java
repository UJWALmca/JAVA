package com.example.STUDENT_MANAGEMENT.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.STUDENT_MANAGEMENT.ENTITY.Student;
import com.example.STUDENT_MANAGEMENT.MODEL.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepository;
	
	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}
	
	
	public void savestudents(Student student) {
		studentrepository.save(student);
	}
	
	

}
