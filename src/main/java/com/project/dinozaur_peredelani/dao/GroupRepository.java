package com.project.dinozaur_peredelani.dao;

import com.project.dinozaur_peredelani.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group,Integer> {
}
