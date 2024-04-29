package com.project.dinozaur_peredelani.error;

import com.project.dinozaur_peredelani.controller.ZaurException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(value = {ZaurException.class})
    protected ResponseEntity<ErrorDto> handleZaurError() {
        return ResponseEntity
                .status(400)
                .header("zalupa", "49,5cm")
                .body(new ErrorDto(400,"Aw shieeeeeeet"));

    }

}
