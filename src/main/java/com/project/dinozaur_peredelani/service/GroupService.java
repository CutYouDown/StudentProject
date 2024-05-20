package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GroupService {
    void addGroup(GroupRequestDto groupRequestDto);
    GroupRequestDto getGroup(@RequestParam Integer id);
    List<GroupRequestDto> getAllGroups();

}
