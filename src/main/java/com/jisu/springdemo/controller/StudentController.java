package com.jisu.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jisu.springdemo.model.Student;
import com.jisu.springdemo.repo.StudentRepo;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping
    public List<Student> getAllStudents() {
        return this.studentRepo.findAll();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return this.studentRepo.save(student);
    }
}
