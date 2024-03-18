package com.example.teste.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Chamado {
    @Id
    private Long id;
    private String data_abertura;
    private String data_fechamento;
    private String descricao;
    private String status;

    @ManyToOne
    @JoinColumn(name = "atividades_id")
    private Atividade atividade;

    @ManyToOne
    @JoinColumn(name = "pessoa_email")
    private Pessoa pessoa;

    // getters and setters
}
