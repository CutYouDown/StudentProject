package com.project.dinozaur_peredelani.mapper;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dto.StudentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", imports = {Student.class})
public interface StudentMapper {
    Student toStudent(StudentRequestDto studentRequestDto);
    List<Student> toStudentList(List<StudentRequestDto> studentRequestDto);
    StudentRequestDto toStudentRequestDto (Student student);
    List<StudentRequestDto> toStudentRequestDtoList (List<Student> student);
}
