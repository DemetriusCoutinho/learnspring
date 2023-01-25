package br.com.learnspring.resources.requests;


import javax.validation.constraints.NotEmpty;

public record EnderecoRequest(
        @NotEmpty String rua,
        @NotEmpty String numero,
        @NotEmpty String bairro) {
}
