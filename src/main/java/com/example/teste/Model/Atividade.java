package com.example.teste.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private String horario;
    private String local;
    private Integer n_participantes;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "pessoa_email")
    private Pessoa pessoa;

    // getters and setters
}
