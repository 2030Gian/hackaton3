package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.CourseType;

public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {
}
