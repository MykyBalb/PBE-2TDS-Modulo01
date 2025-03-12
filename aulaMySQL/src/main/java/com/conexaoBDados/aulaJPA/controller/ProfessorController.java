package com.conexaoBDados.aulaJPA.controller;

import com.conexaoBDados.aulaJPA.entity.Professor;
import com.conexaoBDados.aulaJPA.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorRepository pfRepository;

    @GetMapping("professor/get")


    @PostMapping("/professor/add")
    public ResponseEntity<Boolean> adicionarProfessor(@RequestBody Professor p) {
        pfRepository.save(p);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }


}
