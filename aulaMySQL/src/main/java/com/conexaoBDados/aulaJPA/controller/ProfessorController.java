package com.conexaoBDados.aulaJPA.controller;

import com.conexaoBDados.aulaJPA.entity.Professor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    public ResponseEntity<Boolean> adicionarProfessor(@RequestBody Professor p) {

    }
}
