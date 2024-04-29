package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dto.AddStudentRequestDto;
import com.project.dinozaur_peredelani.dto.GetStudentRequestDto;
import com.project.dinozaur_peredelani.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Object> getAll(){
        return studentService.getAllStudents();
    }
    //public void getStudentError(){throw new ZaurException();}
}
