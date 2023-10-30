package com.example.hakaton2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.hakaton2.entidades.CourseAssessmentDetails;
import com.example.hakaton2.repositorios.CourseAssessmentDetailsRepository;

import java.util.List; 
import java.util.Optional;

@RestController("Controller")
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {

    @Autowired
    private CourseAssessmentDetailsRepository courseAssessmentDetailsRepository;

    @GetMapping
    public ResponseEntity<List<CourseAssessmentDetails>> courseAssessmentDetailss(){
        List<CourseAssessmentDetails> courseAssessmentDetailss = courseAssessmentDetailsRepository.findAll();
        return new ResponseEntity<>(courseAssessmentDetailss, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> courseAssessmentDetailss(@PathVariable Long id){
    Optional<CourseAssessmentDetails> courseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
    
    if (courseAssessmentDetails.isPresent()) {
        return new ResponseEntity<>(courseAssessmentDetails.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    } }

    
    @PostMapping
    public ResponseEntity<String> courseAssessmentDetails(@RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        courseAssessmentDetailsRepository.save(courseAssessmentDetails);
        return ResponseEntity.status(201).body("new item created");
    }

    
}


    