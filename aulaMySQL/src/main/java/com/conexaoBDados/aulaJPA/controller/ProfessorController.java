package com.conexaoBDados.aulaJPA.controller;

import com.conexaoBDados.aulaJPA.entity.Professor;
import com.conexaoBDados.aulaJPA.repository.ProfessorRepository;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.InterruptedNamingException;
import java.util.List;

@RestController
public class ProfessorController {
    @Autowired
    private ProfessorRepository pfRepository;

    @GetMapping("professor/get")
    public List<Professor> getProfessor() {
        return pfRepository.findAll();
    }

    @PostMapping("/professor/add")
    public ResponseEntity<Boolean> postProfessor(@RequestBody Professor p) {
        pfRepository.save(p);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

    @PutMapping("professor/put/{id}")
    public ResponseEntity<Professor> putprofessor(@PathVariable Integer id, @RequestBody Professor p) {
       if (!pfRepository.existsById(id)){
           return ResponseEntity.notFound().build();
        }
       p.setId(id);
       Professor saveProfessor = pfRepository.save(p);
       return ResponseEntity.ok(saveProfessor);
    }

    @DeleteMapping("professor/delete/{id}")
    public ResponseEntity<Boolean> deleteProfessor(@PathVariable Integer id) {
        if(!pfRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        pfRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
