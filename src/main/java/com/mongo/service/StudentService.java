package com.mongo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mongo.model.Student;

//@Service
public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student getStudentById(int id);
	
	public String deleteStudent(int id);

}
