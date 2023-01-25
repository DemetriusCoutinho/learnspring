package br.com.learnspring.repositories;

import br.com.learnspring.entities.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LojaRepository extends JpaRepository<Loja, Long> {
}
