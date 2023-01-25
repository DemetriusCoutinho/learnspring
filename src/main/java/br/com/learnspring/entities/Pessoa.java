package br.com.learnspring.entities;

import br.com.learnspring.entities.embedded.Endereco;
import br.com.learnspring.resources.responses.PessoaResponse;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity(name = "TB_PESSOA")
public class Pessoa {
    @Id
    @SequenceGenerator(name = "pessoa_seq", sequenceName = "pessoa_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Embedded
    private Endereco endereco;

    @OneToOne(mappedBy = "pessoa")
    private Loja loja;


    public Pessoa(@Nullable Long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa() {

    }


    public String getNome() {
        return nome;
    }

    public PessoaResponse toModel() {
        return new PessoaResponse(id, nome);
    }
}
