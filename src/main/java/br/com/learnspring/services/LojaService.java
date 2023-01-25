package br.com.learnspring.services;

import br.com.learnspring.entities.Loja;
import br.com.learnspring.repositories.LojaRepository;
import br.com.learnspring.resources.requests.LojaRequest;
import org.springframework.stereotype.Service;

@Service
public class LojaService {
    private final LojaRepository lojaRepository;
    private final PessoaService pessoaService;

    public LojaService(LojaRepository lojaRepository, PessoaService pessoaService) {
        this.lojaRepository = lojaRepository;
        this.pessoaService = pessoaService;
    }

    public void cadastrarLoja(LojaRequest lojaRequest) {
        var pessoa = pessoaService.findById(lojaRequest.idPessoa());

        lojaRepository.save(
                new Loja(
                        null,
                        lojaRequest.nome(),
                        lojaRequest.cnpj(),
                        pessoa
                )
        );
    }
}
