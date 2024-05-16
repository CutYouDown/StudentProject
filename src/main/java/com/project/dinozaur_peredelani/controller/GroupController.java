package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import com.project.dinozaur_peredelani.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@RequestMapping(path = "/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping
    public void addGroup(@RequestBody GroupRequestDto groupRequestDto){
        log.info("Получен запрос на добавление группы");
        groupService.addGroup(groupRequestDto);
    }

    @GetMapping
    public List<Group> getGroup(){
        log.info("Получен запрос на выдачу списка групп");
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public GroupRequestDto getGroup(@PathVariable Integer id){
        log.info("Получен запрос на выдачу группы с id={}", id);
        return groupService.getGroup(id);
    }

}
