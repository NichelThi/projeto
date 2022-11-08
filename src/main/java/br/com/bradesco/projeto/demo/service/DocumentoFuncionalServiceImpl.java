package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.DocumentoFuncional;
import br.com.bradesco.projeto.demo.repository.DocumentoFuncionalRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class DocumentoFuncionalServiceImpl implements DocumentoFuncionalService {
    private final DocumentoFuncionalRepository documentoFuncionalRepository;
    private List<DocumentoFuncional> list = new ArrayList<>();

    @Override
    public List<DocumentoFuncional> list() {
        return IterableUtils.toList(documentoFuncionalRepository.findAll());
    }

    @Override
    public DocumentoFuncional save(DocumentoFuncional documentoFuncional) {
        return documentoFuncionalRepository.save(documentoFuncional);
    }

    @Override
    public DocumentoFuncional getById(Long id) {
        return documentoFuncionalRepository.findById(id).get();
    }

    @Override
    public DocumentoFuncional update(Long id, DocumentoFuncional documentoFuncional) {
        documentoFuncional.setId(id);
        int index = list.indexOf(documentoFuncional);
        return list.set(index, documentoFuncional);
    }

    @Override
    public void delete(Long id) {
        documentoFuncionalRepository.deleteById(id);
    }
}

