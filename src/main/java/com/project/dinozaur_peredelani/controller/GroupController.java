package com.project.dinozaur_peredelani.controller;

import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import com.project.dinozaur_peredelani.service.GroupService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Slf4j
@Tag(name = "Контроллер групп", description = "Группы")
@RequestMapping(path = "/groups")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping
    @Operation(summary = "Добавление группы")
    public void addGroup(@RequestBody GroupRequestDto groupRequestDto){
        log.info("Получен запрос на добавление группы");
        groupService.addGroup(groupRequestDto);
    }

    @GetMapping
    @Operation(summary = "Получение всех групп")
    public List<GroupRequestDto> getGroup(){
        log.info("Получен запрос на выдачу списка групп");
        return groupService.getAllGroups();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Получение одной группы по айди")
    public GroupRequestDto getGroup(@PathVariable Integer id){
        log.info("Получен запрос на выдачу группы с id={}", id);
        return groupService.getGroup(id);
    }

}
