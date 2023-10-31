package com.example.hakaton2.controladores;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import  org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import  org.springframework.web.bind.annotation.*;


import com.example.hakaton2.entidades.CourseAssessment;
import com.example.hakaton2.repositorios.CourseAssessmentRepository;

import java.util.List;

@RestController("CourseAssessmentController")
@RequestMapping("/course_assessment")
public class CourseAssessmentController {
    
    @Autowired CourseAssessmentRepository courseAssessmentRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessment>> getCourseAssessment(){
        List<CourseAssessment> courseAssessment = courseAssessmentRepository.findAll();
        return new ResponseEntity<>(courseAssessment, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<CourseAssessment> addCourseAssessment(@RequestBody CourseAssessment courseAssessment) {
        CourseAssessment newCourseAssessment= courseAssessmentRepository.save(courseAssessment);
        return new ResponseEntity<>(newCourseAssessment,HttpStatus.CREATED);
    }

    
}
