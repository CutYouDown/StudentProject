package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.dto.StudentRequestDto;

import java.util.List;

public interface StudentService {
    void addStudent (StudentRequestDto studentRequestDto);

    List<Object> getAllStudents();
}
