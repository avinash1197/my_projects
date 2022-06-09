package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
