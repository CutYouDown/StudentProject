package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import com.project.dinozaur_peredelani.dto.GetGroupRequestDto;
import com.project.dinozaur_peredelani.service.GroupService;
import com.project.dinozaur_peredelani.service.GroupServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto){
        groupService.addGroup(addGroupRequestDto);
    }

    @GetMapping
    public List<Group> getGroup(){
        Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);
        logger.info("сработала ручка get-запроса /groups");
        System.out.println("сработала ручка get-запроса /groups");
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    public GetGroupRequestDto getGroup(@PathVariable Integer id){
        System.out.println("запрошенный айдишник: " + id);
        return groupService.getGroup(id);
    }

}
