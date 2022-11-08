package br.com.bradesco.projeto.demo.repository;

import br.com.bradesco.projeto.demo.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
