package br.com.learnspring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Loja {
    @Id
    @SequenceGenerator(name = "loja_seq", sequenceName = "loja_seq")
    @GeneratedValue(generator = "loja_req", strategy = GenerationType.SEQUENCE)
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private String cnpj;
    @OneToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa pessoa;

    @OneToMany(mappedBy = "loja")
    private List<Produto> produtos;

    public Loja(Long id, String nome, String cnpj, Pessoa pessoa) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.pessoa = pessoa;
    }

    public Loja() {

    }
}
