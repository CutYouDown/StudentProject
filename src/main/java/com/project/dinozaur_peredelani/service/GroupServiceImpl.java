package com.project.dinozaur_peredelani.service;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dao.GroupRepository;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import com.project.dinozaur_peredelani.mapper.GroupMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private GroupMapper groupMapper;


    @Override
    public void addGroup(GroupRequestDto groupRequestDto) {
        log.info("Добавляется запись о группе {}", groupRequestDto.getName());
        Group group = groupMapper.toEntity(groupRequestDto);
        groupRepository.save(group);
        log.info("Запись добавлена");
    }

    @Override
    public GroupRequestDto getGroup(@RequestParam Integer id) {
        log.info("Идёт получение записи");
        Group group = groupRepository.findGroupById(id);
        GroupRequestDto groupRequestDto= groupMapper.toDto(group);
        return groupRequestDto;
    }

    @Override
    public List<GroupRequestDto> getAllGroups() {
        log.info("Идёт получение списка групп");
        List<Group> allGroups = groupRepository.findAll();
        return allGroups.stream()
                .map(groupMapper::toDto)
                .collect(Collectors.toList());
    }
}
