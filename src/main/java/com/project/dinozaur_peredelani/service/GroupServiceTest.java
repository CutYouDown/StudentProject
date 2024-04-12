package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;

public class GroupServiceTest implements GroupService{
    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
        System.out.println("TEST ADDING");
    }
}
