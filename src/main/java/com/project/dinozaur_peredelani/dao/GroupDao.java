package com.project.dinozaur_peredelani.dao;

import com.project.dinozaur_peredelani.Group;
import org.springframework.stereotype.Repository;

@Repository
public class GroupDao {
    public void add(Group group){

    }
    public Group findById(Integer id){
        Group group = new Group();
        return group;
    }
}
