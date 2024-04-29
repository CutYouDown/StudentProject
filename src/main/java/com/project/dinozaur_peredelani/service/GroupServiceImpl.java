package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dao.GroupRepository;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import com.project.dinozaur_peredelani.dto.GetGroupRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;
    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
        Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);
        logger.info("adding req logger");
        Group group = new Group();
        group.setName(addGroupRequestDto.getName());
        groupRepository.save(group);
        System.out.println("ADDING");
    }

    @Override
    public GetGroupRequestDto getGroup(@RequestParam Integer id) {
        Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);
        logger.info("getting req logger");
        Group group = groupRepository.findGroupById(id);
        GetGroupRequestDto getGroupRequestDto= new GetGroupRequestDto();
        getGroupRequestDto.setId(group.getId());
        getGroupRequestDto.setName(group.getName());
        return getGroupRequestDto;
    }

    @Override
    public List<Group> getAllGroups() {
        List<Group> allGroups = groupRepository.findAll();
        return allGroups;
    }
}
