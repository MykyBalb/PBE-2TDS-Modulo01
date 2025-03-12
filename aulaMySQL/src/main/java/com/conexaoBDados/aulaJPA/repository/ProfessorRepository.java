package com.conexaoBDados.aulaJPA.repository;

import com.conexaoBDados.aulaJPA.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
