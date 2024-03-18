package com.example.teste.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ModuloAtividades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pessoa_email")
    private Pessoa pessoa;

}
