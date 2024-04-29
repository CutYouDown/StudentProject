package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import com.project.dinozaur_peredelani.dto.GetGroupRequestDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GroupService {
    void addGroup(AddGroupRequestDto addGroupRequestDto);
    GetGroupRequestDto getGroup(@RequestParam Integer id);
    List<Group> getAllGroups();

}
