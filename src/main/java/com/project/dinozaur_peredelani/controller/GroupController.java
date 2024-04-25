package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import com.project.dinozaur_peredelani.service.GroupService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;


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
    public void getGroup(){
        System.out.println("GETTING");
    }
}
