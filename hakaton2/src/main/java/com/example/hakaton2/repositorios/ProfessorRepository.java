package com.example.hakaton2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hakaton2.entidades.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
