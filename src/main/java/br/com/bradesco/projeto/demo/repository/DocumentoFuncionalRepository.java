package br.com.bradesco.projeto.demo.repository;

import br.com.bradesco.projeto.demo.domain.DocumentoFuncional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoFuncionalRepository extends CrudRepository<DocumentoFuncional, Long> {
}
