package com.example.STUDENT_MANAGEMENT.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.STUDENT_MANAGEMENT.MODEL.*;
import com.example.STUDENT_MANAGEMENT.ENTITY.*;

@Service
public class CourseService{

@Autowired
CourseRepository courserepository;


public List<Course> getAll(){
 return courserepository.findAll();
 }
 
 public  Course saveAll(Course course){
  return courserepository.save(course);
 }
}
 