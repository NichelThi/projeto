package br.com.bradesco.projeto.demo.repository;

import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.domain.Secao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JuncaoRepository extends CrudRepository<Juncao, Long> {
}
