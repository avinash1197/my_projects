package com.mongo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.model.Student;
import com.mongo.repository.StudentRepository;
import com.mongo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		
		Optional<Student> op = studentRepository.findById(id);
		Student st = op.isPresent()?op.get():null;
		return st;
	}

	@Override
	public String deleteStudent(int id) {
		studentRepository.deleteById(id);
		return "Student Deleted:- "+id;
	}

}
