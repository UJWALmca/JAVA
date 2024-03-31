package com.example.STUDENT_MANAGEMENT.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.STUDENT_MANAGEMENT.ENTITY.Course;
import com.example.STUDENT_MANAGEMENT.ENTITY.Teacher;
import com.example.STUDENT_MANAGEMENT.MODEL.*;

@Service
public class teacherservice {
	@Autowired
	teacherRepo teachrepo;
	
	
	public List<Teacher> getAll(){
		 return teachrepo.findAll();
		 }
		 
		 public  Teacher saveAll(Teacher teacher){
		  return teachrepo.save(teacher);
		 }
		 

}
