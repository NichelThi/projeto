package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.exception.AnexoNotFound;
import br.com.bradesco.projeto.demo.domain.DocumentoFuncional;
import br.com.bradesco.projeto.demo.repository.DocumentoFuncionalRepository;
import br.com.bradesco.projeto.demo.repository.DocumentoRepository;
import br.com.bradesco.projeto.demo.domain.Documento;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class DocumentoFuncionalServiceImpl implements DocumentoFuncionalService {
    private final DocumentoFuncionalRepository documentoFuncionalRepository;
    private final DocumentoRepository documentoRepository;
    private final AnexoNotFound anexoNotFound;
    private List<DocumentoFuncional> list = new ArrayList<>();

    @Override
    public List<DocumentoFuncional> list() {
        return IterableUtils.toList(documentoFuncionalRepository.findAll());
    }

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

