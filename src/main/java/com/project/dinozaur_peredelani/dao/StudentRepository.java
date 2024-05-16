package com.project.dinozaur_peredelani.dao;

import com.project.dinozaur_peredelani.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    @Query(nativeQuery = true, value = "SELECT s.id, s.name, g.name as \"group\" FROM students s JOIN groups g ON s.\"group-id\" = g.id")
    public List<Object> getCombinedData();



}
