package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dao.StudentRepository;
import com.project.dinozaur_peredelani.dto.AddStudentRequestDto;
import com.project.dinozaur_peredelani.dto.GetStudentRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        student.setGroupId(addStudentRequestDto.getGroup());
        studentRepository.save(student);
        System.out.println("Adding dis trash");
    }

    @Override
    public List<Object> getAllStudents() {
        List<Object> allStudents = studentRepository.getCombinedData();
        return allStudents;
    }
}
