package com.rajat.service;

import com.rajat.entity.Student;

public interface StudentService {
	public Student getStudent(int roll);
	public Student saveStudent(Student student);
}
