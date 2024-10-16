package com.rajat.service.impl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajat.entity.Student;
import com.rajat.repo.StudentRepo;
import com.rajat.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	Student s = new Student();
	
	@Autowired
	StudentRepo repo;
	
	public Student getStudent(int roll) {
		
		s.setRoll(1);
		s.setName("Ram");
		return s;
	}

	public Student saveStudent(Student student) {
		student.setAddresses(null);
		repo.save(student);
		return student;
	}

}
