package br.com.bradesco.projeto.demo.repository;

import br.com.bradesco.projeto.demo.domain.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {
}
