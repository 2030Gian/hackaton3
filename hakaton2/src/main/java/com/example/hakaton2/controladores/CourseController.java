package com.example.hakaton2.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.Course;
import com.example.hakaton2.repositorios.CourseRepository;

import java.util.List;

@RestController("CourseController")
@RequestMapping("/courses")
public class CourseController {
    
    @Autowired CourseRepository courseRepository;
    

    @GetMapping
    public ResponseEntity<List<Course>> getcourse(){
        List<Course> courses = courseRepository.findAll();

        return new ResponseEntity<>(courses,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Course> course(@RequestBody Course course){
        Course newCourse = courseRepository.save(course);
        return new ResponseEntity<>(newCourse, HttpStatus.CREATED);

    }

    

    
}
