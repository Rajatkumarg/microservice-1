package com.rajat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajat.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
