package br.com.learnspring.entities.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "bairro")
    private String bairro;

    public Endereco(String rua, String numero, String bairro) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public Endereco() {

    }
}
