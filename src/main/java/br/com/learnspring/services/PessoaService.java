package br.com.learnspring.services;

import br.com.learnspring.entities.Pessoa;
import br.com.learnspring.repositories.PessoaRepository;
import br.com.learnspring.resourcers.requests.PessoaRequest;
import br.com.learnspring.resourcers.responses.PessoaResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaResponse salvar(PessoaRequest request) {
        pessoaRepository.save(
                new Pessoa(
                        UUID.randomUUID(),
                        request.nome()
                )
        );
        return new PessoaResponse(null, request.nome());
    }
}
