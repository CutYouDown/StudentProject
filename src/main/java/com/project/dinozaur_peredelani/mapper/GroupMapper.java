package com.project.dinozaur_peredelani.mapper;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface GroupMapper {
    GroupRequestDto toDto (Group group);
    Group toEntity (GroupRequestDto groupRequestDto);
}
