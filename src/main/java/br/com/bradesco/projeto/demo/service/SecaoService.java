package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Secao;

import java.util.List;

public interface SecaoService {

    List<Secao> list();
    Secao save(Secao secao);
    Secao getById(Long id);
    Secao update(Long id, Secao secao);
    void delete(Long id);
}
