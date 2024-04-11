package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import org.springframework.stereotype.Service;

@Service
public class GroupService {
    public void addGroup(AddGroupRequestDto addGroupRequestDto){
        System.out.println("ADDING");
        Group group = new Group();
        group.setGroupName(addGroupRequestDto.getGroupName());
    }

}
