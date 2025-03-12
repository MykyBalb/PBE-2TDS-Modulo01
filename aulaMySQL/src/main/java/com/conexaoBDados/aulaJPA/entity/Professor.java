package com.conexaoBDados.aulaJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Professor {
    @Id
    private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;
}
