package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dao.GroupRepository;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Slf4j
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;


    @Override
    public void addGroup(GroupRequestDto groupRequestDto) {
        log.info("Добавляется запись о группе {}", groupRequestDto.getName());
        Group group = new Group();
        group.setName(groupRequestDto.getName());
        groupRepository.save(group);
        System.out.println("Запись добавлена");
    }

    @Override
    public GroupRequestDto getGroup(@RequestParam Integer id) {
        log.info("Идёт получение записи");
        Group group = groupRepository.findGroupById(id);
        GroupRequestDto groupRequestDto= new GroupRequestDto();
        groupRequestDto.setId(group.getId());
        groupRequestDto.setName(group.getName());
        return groupRequestDto;
    }

    @Override
    public List<Group> getAllGroups() {
        log.info("Идёт получение списка групп");
        List<Group> allGroups = groupRepository.findAll();
        return allGroups;
    }
}
