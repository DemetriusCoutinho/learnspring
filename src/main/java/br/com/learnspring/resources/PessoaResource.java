package br.com.learnspring.resources;

import br.com.learnspring.resources.requests.PessoaRequest;
import br.com.learnspring.resources.responses.PessoaResponse;
import br.com.learnspring.services.PessoaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pessoas")
public class PessoaResource {
    private final PessoaService pessoaService;

    public PessoaResource(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @PostMapping("/cadastrar")
    public PessoaResponse cadastro(@RequestBody PessoaRequest request) {
        return pessoaService.salvar(request);
    }

    @PutMapping
    public String atualizar() {
        return "atualizado com sucesso!";
    }
}
