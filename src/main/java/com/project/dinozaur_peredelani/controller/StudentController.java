package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.dto.AddStudentRequestDto;
import com.project.dinozaur_peredelani.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public void addStudent(@RequestBody AddStudentRequestDto addStudentRequestDto){
        studentService.addStudent(addStudentRequestDto);
    }
    @GetMapping
    public void getStudent(){
        System.out.println("GETTING DIS MOFOCKA");
    }
}
