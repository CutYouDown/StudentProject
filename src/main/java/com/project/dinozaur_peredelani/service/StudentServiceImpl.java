package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dao.StudentRepository;
import com.project.dinozaur_peredelani.dto.StudentRequestDto;
import com.project.dinozaur_peredelani.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    StudentMapper studentMapper;
    @Override
    public void addStudent(StudentRequestDto studentRequestDto) {
        log.info("Doin logging job");
        Student student = studentMapper.toStudent(studentRequestDto);
        studentRepository.save(student);
        System.out.println("Adding dis trash");

    }

    @Override
    public List<Object> getAllStudents() {
        List<Object> allStudents = studentRepository.getCombinedData();
        return allStudents;
    }
}
