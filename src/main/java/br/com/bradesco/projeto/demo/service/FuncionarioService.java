package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Funcionario;


import java.util.List;

public interface FuncionarioService {

    List<Funcionario> list();
    Funcionario save(Funcionario funcionario);
    Funcionario getById(Long id);
    Funcionario update(Long id, Funcionario funcionario);
    void delete(Long id);
}
