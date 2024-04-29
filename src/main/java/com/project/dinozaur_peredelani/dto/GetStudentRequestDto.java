package com.project.dinozaur_peredelani.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStudentRequestDto {
    private Integer id;
    private String name;
    private String group;

}
