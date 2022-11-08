package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Documento;

import java.util.List;

public interface DocumentoService {

    List<Documento> list();
    Documento save(Documento documento);
    Documento getById(Long id);
    Documento update(Long id, Documento documento);
    void delete(Long id);
}
