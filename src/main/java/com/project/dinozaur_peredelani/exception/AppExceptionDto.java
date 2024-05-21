package com.project.dinozaur_peredelani.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppExceptionDto {
    private int code;
    private String description;
}
