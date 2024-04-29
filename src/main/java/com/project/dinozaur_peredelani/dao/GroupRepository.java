package com.project.dinozaur_peredelani.dao;

import com.project.dinozaur_peredelani.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {
    Group findGroupById(Integer id);

    List<Group> findAll();
}
