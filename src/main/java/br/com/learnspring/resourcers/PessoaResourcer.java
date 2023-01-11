package br.com.learnspring.resourcers;

import br.com.learnspring.resourcers.requests.PessoaRequest;
import br.com.learnspring.resourcers.responses.PessoaResponse;
import br.com.learnspring.services.PessoaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/pessoas")
public class PessoaResourcer {
    private final PessoaService pessoaService;

    public PessoaResourcer(PessoaService pessoaService) {
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
