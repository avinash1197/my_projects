package com.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.model.Student;
import com.mongo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/")
	public String testApp() {
		return "Stud App Working";
	}

	@PostMapping("/saveStude")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		Student st = studentService.saveStudent(student);
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}

	@GetMapping("/getAllStud")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> studeList = studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(studeList, HttpStatus.OK);
	}

	@GetMapping("/getStudById/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id) {
		Student st = studentService.getStudentById(id);
		return new ResponseEntity<Student>(st, HttpStatus.OK);
	}

	@DeleteMapping("/deleteStud/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") int id) {
		String str = studentService.deleteStudent(id);
		return new ResponseEntity<String>(str, HttpStatus.OK);
	};

}
