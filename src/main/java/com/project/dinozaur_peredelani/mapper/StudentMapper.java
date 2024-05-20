package com.project.dinozaur_peredelani.mapper;

import com.project.dinozaur_peredelani.Student;
import com.project.dinozaur_peredelani.dto.StudentRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GroupMapper.class})
public interface StudentMapper {
    @Mapping(source = "group.id", target = "groupId")
    @Mapping(source = "group.name", target = "groupName")
    StudentRequestDto toDto (Student student);
    @Mapping(source = "groupId", target = "group.id")
    Student toEntity (StudentRequestDto studentRequestDto);



    /*Student toStudent(StudentRequestDto studentRequestDto);
    List<Student> toStudentList(List<StudentRequestDto> studentRequestDto);
    StudentRequestDto toStudentRequestDto (Student student);
    List<StudentRequestDto> toStudentRequestDtoList (List<Student> student);*/
}
