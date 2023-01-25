package br.com.learnspring.resources;

import br.com.learnspring.resources.requests.LojaRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/lojas")
public class LojaResource {
    @PostMapping(path = "/cadastrar")
    public void cadastrar(@RequestBody LojaRequest lojaRequest) {

    }
}
