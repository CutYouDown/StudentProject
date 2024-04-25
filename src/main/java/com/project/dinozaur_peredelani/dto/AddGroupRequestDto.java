package com.project.dinozaur_peredelani.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddGroupRequestDto {
    private String name;
    private int quantity;
}
