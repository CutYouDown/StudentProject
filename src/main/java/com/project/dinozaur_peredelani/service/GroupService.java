package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import org.springframework.stereotype.Service;


public interface GroupService {
    void addGroup(AddGroupRequestDto addGroupRequestDto);
}
