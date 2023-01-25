package br.com.learnspring.repositories;

import br.com.learnspring.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {



}
