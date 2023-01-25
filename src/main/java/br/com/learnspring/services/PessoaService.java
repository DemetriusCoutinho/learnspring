package br.com.learnspring.services;

import br.com.learnspring.entities.Pessoa;
import br.com.learnspring.entities.embedded.Endereco;
import br.com.learnspring.repositories.PessoaRepository;
import br.com.learnspring.resources.requests.PessoaRequest;
import br.com.learnspring.resources.responses.PessoaResponse;
import br.com.learnspring.services.exceptions.ItemNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public PessoaResponse salvar(PessoaRequest request) {
        var pessoa = pessoaRepository.save(
                new Pessoa(
                        null,
                        request.nome(),
                        new Endereco(
                                request.endereco().rua(),
                                request.endereco().numero(),
                                request.endereco().bairro()
                        )
                )
        );
        return new PessoaResponse(null, pessoa.getNome());
    }

    public Pessoa findById(Long idPessoa) throws ItemNotFoundException {
        return this.pessoaRepository
                .findById(idPessoa)
                .orElseThrow(ItemNotFoundException::new);


    }
}
