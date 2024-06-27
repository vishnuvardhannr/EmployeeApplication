package com.example.EmployeeApplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @GetMapping("/employee")
    public ResponseEntity<String> getEmp(){
        System.out.println("This is main");
        return new ResponseEntity<>("Emp details", HttpStatus.OK);
    }

}
