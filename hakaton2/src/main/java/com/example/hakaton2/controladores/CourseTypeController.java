package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.hakaton2.entidades.CourseType;
import com.example.hakaton2.repositorios.CourseTypeRepository;

import java.util.List;
import java.util.Optional;

@RestController("CourseTypeController")
@RequestMapping("/course_type")
public class CourseTypeController {

    @Autowired CourseTypeRepository courseTypeRepository;

    /*
    @GetMapping
    public ResponseEntity<List<CourseType>> courseTypes(){
        List <CourseType> courseTypes = courseTypeRepository.findAll();
        return new ResponseEntity<>(courseTypes, HttpStatus.OK);
    }
    

    @PostMapping
    public ResponseEntity<String> courseType(@RequestBody CourseType courseType){

        courseTypeRepository.save(courseType);
        return ResponseEntity.status(201).body("Create CourseType");
    }
    */
}













