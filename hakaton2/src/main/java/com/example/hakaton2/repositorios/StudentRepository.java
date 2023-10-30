package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
