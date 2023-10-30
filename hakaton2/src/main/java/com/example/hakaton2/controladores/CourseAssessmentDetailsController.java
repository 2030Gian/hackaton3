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

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseAssessmentDetails(@PathVariable Long id) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (optionalCourseAssessmentDetails.isPresent()) { // el Optional 
            courseAssessmentDetailsRepository.deleteById(id);
            return ResponseEntity.status(200).body("Deleted");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateCourseAssessmentDetails(@PathVariable Long id, @RequestBody CourseAssessmentDetails courseAssessmentDetails) {
        Optional<CourseAssessmentDetails> optionalCourseAssessmentDetails = courseAssessmentDetailsRepository.findById(id);
        if (optionalCourseAssessmentDetails.isPresent()) {
            // realizo una copia de lo que traje con el metodo findById()
            CourseAssessmentDetails existingCourseAssessmentDetails = optionalCourseAssessmentDetails.get();
            existingCourseAssessmentDetails.setScore(courseAssessmentDetails.getScore());
            existingCourseAssessmentDetails.setSection(courseAssessmentDetails.getSection());
            existingCourseAssessmentDetails.setSectionGroup(courseAssessmentDetails.getSectionGroup());
            existingCourseAssessmentDetails.setCourseAssessment(courseAssessmentDetails.getCourseAssessment());
            existingCourseAssessmentDetails.setProfessor(courseAssessmentDetails.getProfessor());
            existingCourseAssessmentDetails.setStudent(courseAssessmentDetails.getStudent());
            courseAssessmentDetailsRepository.save(existingCourseAssessmentDetails);

            return ResponseEntity.status(200).body("Updated");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }


    
}


    