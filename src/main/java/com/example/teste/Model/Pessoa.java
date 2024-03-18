package com.example.teste.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pessoa")
public abstract class Pessoa {
    @Id
    private long id;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private String telefone;
    private LocalDate data_nascimento;
    private String endereco;
    private double altura;
    private double peso;
    private String historico_medico;

}

@Entity
@DiscriminatorValue("Administrador")
class Administrador extends Pessoa { }

@Entity
@DiscriminatorValue("Gestor")
class Gestor extends Pessoa {
    private boolean is_Active;
    private String matricula;
}

@Entity
@DiscriminatorValue("Cidadao")
class Cidadao extends Pessoa { }

@Entity
@DiscriminatorValue("Professor")
class Professor extends Pessoa {
    private boolean is_Active;
    private String matricula;
    private String modalidade;
}
