package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.CourseAssessment;

public interface CourseAssessmentRepository extends JpaRepository<CourseAssessment, Long> {
}
