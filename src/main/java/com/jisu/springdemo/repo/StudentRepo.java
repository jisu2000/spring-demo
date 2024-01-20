package com.jisu.springdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jisu.springdemo.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
