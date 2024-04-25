package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dao.GroupRepository;
import com.project.dinozaur_peredelani.dto.AddGroupRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;
    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
        Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);
        logger.info("Hello World");
        Group group = new Group();
        group.setName(addGroupRequestDto.getName());
        group.setQuantity(addGroupRequestDto.getQuantity());
        groupRepository.save(group);
        System.out.println("ADDING");
    }
}
