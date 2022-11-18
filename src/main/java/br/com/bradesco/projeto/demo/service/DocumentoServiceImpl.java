package br.com.bradesco.projeto.demo.service;
import br.com.bradesco.projeto.demo.domain.Documento;
import br.com.bradesco.projeto.demo.exception.DocumentoIncompleto;
import br.com.bradesco.projeto.demo.repository.DocumentoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class DocumentoServiceImpl implements DocumentoService {
    private final DocumentoRepository documentoRepository;
    private List<Documento> list = new ArrayList<>();

    @Override
    public List<Documento> list() {
        return IterableUtils.toList(documentoRepository.findAll());
    }

    @Override
    public Documento save(Documento documento) {
        if(documento.getId() == null || documento.getData_documento() == null
            || documento.getDocumentoFuncional().isEmpty() || documento.getDocumentoFuncional() == null
            || documento.getAnexo().isEmpty() || documento.getAnexo() == null || documento.getNome().isEmpty()
            || documento.getNome() == null || documento.getData_cadastro() == null || documento.getTipo().isEmpty()
            || documento.getTipo() == null)
        {
            throw new DocumentoIncompleto();
        }else {
            return documentoRepository.save(documento);
        }
    }

    @Override
    public Documento getById(Long id) {
        return documentoRepository.findById(id).get();
    }

    @Override
    public Documento update(Long id, Documento documento) {
        documento.setId(id);
        int index = list.indexOf(documento);
        return list.set(index, documento);
    }

    @Override
    public void delete(Long id) {
        documentoRepository.deleteById(id);
    }
}

