package com.example.aws.springbootpostgresaws.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeController {
   

    @GetMapping("/employees")
    public ResponseEntity<String> getEmployee() {
        System.out.println("hi ");
        return new ResponseEntity<>("nitish",HttpStatus.OK);
    }

}
