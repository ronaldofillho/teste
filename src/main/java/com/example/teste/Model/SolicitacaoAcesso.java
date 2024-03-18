package com.example.teste.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class SolicitacaoAcesso {
    @Id
    private Long id;
    private String status;

    @ManyToOne
    @JoinColumn(name = "pessoa_email_gestor")
    private Pessoa gestor;

    @ManyToOne
    @JoinColumn(name = "pessoa_email_professor")
    private Pessoa professor;

    // getters and setters
}
