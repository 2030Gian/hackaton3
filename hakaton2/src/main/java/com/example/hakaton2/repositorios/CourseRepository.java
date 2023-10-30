package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

