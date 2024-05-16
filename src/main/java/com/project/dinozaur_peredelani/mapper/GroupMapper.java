package com.project.dinozaur_peredelani.mapper;

import com.project.dinozaur_peredelani.Group;
import com.project.dinozaur_peredelani.dto.GroupRequestDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GroupMapper {
    Group toGroup(GroupRequestDto groupRequestDto);
    List<Group> toGroupList(List<GroupRequestDto> groupRequestDto);
    GroupRequestDto toGroupRequestDto (Group group);
    List<GroupRequestDto> toGroupRequestDtoList (List<Group> group);
}
