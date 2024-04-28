package com.project.dinozaur_peredelani.dao;

import com.project.dinozaur_peredelani.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
