package br.com.learnspring.entities;

import javax.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue(generator = "produto_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "produto_seq", sequenceName = "produto_seq")
    @Column(name = "id")
    private Long id;
    @Column(name = "nome_produto")
    private String nomeProduto;

    @ManyToOne
    @JoinColumn(name = "id_loja", nullable = false)
    private Loja loja;

}
