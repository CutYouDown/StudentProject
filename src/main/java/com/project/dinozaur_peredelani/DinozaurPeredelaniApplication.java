package com.project.dinozaur_peredelani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

@SpringBootApplication
public class DinozaurPeredelaniApplication {

    public static void main(String[] args) {
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Привьет");
        SpringApplication.run(DinozaurPeredelaniApplication.class, args);
    }

}
