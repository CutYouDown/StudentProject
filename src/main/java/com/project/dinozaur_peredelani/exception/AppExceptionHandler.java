package com.project.dinozaur_peredelani.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<AppExceptionDto> handleAppException(AppException e) {
        return ResponseEntity
                .status(500)
                .header("zalupa", "49,5cm")
                .body(new AppExceptionDto(500,"Aw shieeeeeeet"));

    }

}
