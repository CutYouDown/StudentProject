package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.dao.GroupRepository;
import com.project.dinozaur_peredelani.dao.StudentRepository;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import com.project.dinozaur_peredelani.dto.StudentRequestDto;
import com.project.dinozaur_peredelani.exception.AppException;
import com.project.dinozaur_peredelani.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path="/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private StudentRepository studentRepository;
    @PostMapping
    public void addStudent(@RequestBody StudentRequestDto studentRequestDto){
        if (!groupRepository.existsById(studentRequestDto.getGroupId())) {
            throw new AppException();
        }
        log.info("Получен запрос на добавление студента");
        studentService.addStudent(studentRequestDto);
    }

    @GetMapping
    public List<StudentRequestDto> getAll(){
        log.info("Получен запрос на выдачу списка студентов");
        return studentService.getAllStudents();
    }
}
