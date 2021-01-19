package com.example.college.controller;


import com.example.college.document.Student;
import com.example.college.service.implementation.ImplStudentsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private ImplStudentsService objService;

    @GetMapping("/all")
//    @ApiOperation("todos los estudiantes")
    public ResponseEntity<List<Student>> getAll(){
        return new ResponseEntity<>(objService.getAll(), HttpStatus.OK);
    }

}
