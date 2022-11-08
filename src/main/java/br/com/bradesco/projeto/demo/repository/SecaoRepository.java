package br.com.bradesco.projeto.demo.repository;

import br.com.bradesco.projeto.demo.domain.Secao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecaoRepository extends CrudRepository<Secao, Long> {
}
