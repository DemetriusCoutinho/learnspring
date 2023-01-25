package br.com.learnspring.resources.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record PessoaResponse(Long id, String nome) {
}
