package com.conexaoBDados.aulaJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Professor {
    @Id
    private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;
}
