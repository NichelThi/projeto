package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Juncao;

import java.util.List;

public interface JuncaoService {

    List<Juncao> list();
    Juncao save(Juncao juncao);
    Juncao getById(Long id);
    Juncao update(Long id, Juncao juncao);
    void delete(Long id);
}
