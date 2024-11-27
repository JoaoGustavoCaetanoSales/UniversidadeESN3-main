package com.example.universidadeESN3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long matricula;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Genero genero;

    private Boolean active;

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", genero=" + genero +
                '}';
    }
}
