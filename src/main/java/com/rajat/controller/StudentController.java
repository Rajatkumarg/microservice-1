package com.rajat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rajat.entity.Student;
import com.rajat.entity.Address;
import java.util.List;
import com.rajat.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("student/")
public class StudentController {

	@Autowired
	StudentServiceImpl service;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("getStudent/{roll}")
	public Student getStudent(@PathVariable int roll) {
		
		Student student = service.getStudent(roll);
		
		String url = "http://localhost:2025/address/getAddress/{roll}";
			
		List<Address> addresses = restTemplate.getForObject(url, List.class);
		
		student.setAddresses(addresses);
		
		return student;
	}
	
	@PostMapping("saveStudent/")
	public Student saveStudent(@RequestBody Student student) {
		
		Student stu = service.saveStudent(student);
		
		List<Address> address = student.getAddresses();
		
		String url = "http://localhost:2025/address/saveAddress/{address}";
			
		List<Address> addresses = restTemplate.getForObject(url, List.class);
		
		student.setAddresses(addresses);
		
		return student;
	}
	
}
