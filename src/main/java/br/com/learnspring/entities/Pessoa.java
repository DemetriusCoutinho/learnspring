package br.com.learnspring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "TB_PESSOA")

public class Pessoa {
    @Id
    @Column
    private UUID id;
    @Column
    private String nome;

    public Pessoa(UUID id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }
}
