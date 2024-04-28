package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dao.StudentRepository;
import com.project.dinozaur_peredelani.dto.AddStudentRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(AddStudentRequestDto addStudentRequestDto) {
        Logger logger= LoggerFactory.getLogger(StudentServiceImpl.class);
        logger.info("Doin logging job");
        Student student = new Student();
        student.setName(addStudentRequestDto.getName());
        student.setGroup(addStudentRequestDto.getGroup());
        studentRepository.save(student);
        System.out.println("Adding dis trash");
    }
}
