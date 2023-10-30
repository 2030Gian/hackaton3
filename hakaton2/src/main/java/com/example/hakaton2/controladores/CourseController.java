package com.example.hakaton2.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import  org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.Course;
import com.example.hakaton2.repositorios.CourseRepository;

import java.util.List;
import java.util.Optional;

@RestController("CourseController")
@RequestMapping("/course")
public class CourseController {
    
    @Autowired CourseRepository courseRepository;
    /* 

    @GetMapping
    public ResponseEntity<List<Course>> courses(){
        List<Course> courses = courseRepository.findAll();

        return new ResponseEntity<>(courses,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> course(@RequestBody Course course){
        courseRepository.save(course);

        return ResponseEntity.status(201).body("Create course");

    }

    */
}
