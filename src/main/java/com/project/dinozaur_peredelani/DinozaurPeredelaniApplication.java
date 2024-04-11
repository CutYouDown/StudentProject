package com.project.dinozaur_peredelani;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication
public class DinozaurPeredelaniApplication {

    public static void main(String[] args) {
        SpringApplication.run(DinozaurPeredelaniApplication.class, args);
    }

}
