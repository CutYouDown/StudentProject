package com.project.dinozaur_peredelani.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetGroupRequestDto {
    private Integer id;
    private String name;
}
