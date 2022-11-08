package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.DocumentoFuncional;


import java.util.List;

public interface DocumentoFuncionalService {

    List<DocumentoFuncional> list();
    DocumentoFuncional save(DocumentoFuncional documentoFuncional);
    DocumentoFuncional getById(Long id);
    DocumentoFuncional update(Long id, DocumentoFuncional documentoFuncional);
    void delete(Long id);
}
