package br.com.learnspring.resourcers.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record PessoaResponse(UUID id, String nome) {
}
