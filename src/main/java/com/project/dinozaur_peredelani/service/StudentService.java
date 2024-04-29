package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dto.AddStudentRequestDto;
import com.project.dinozaur_peredelani.dto.GetStudentRequestDto;

import java.util.List;

public interface StudentService {
    void addStudent (AddStudentRequestDto addStudentRequestDto);

    List<Object> getAllStudents();
}
