package br.com.learnspring.resources.requests;

import br.com.learnspring.entities.embedded.Endereco;

public record PessoaRequest(String nome, EnderecoRequest endereco
) {
}
