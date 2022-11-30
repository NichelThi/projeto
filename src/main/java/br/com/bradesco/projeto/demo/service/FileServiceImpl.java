package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Documento;
import br.com.bradesco.projeto.demo.domain.File;
import br.com.bradesco.projeto.demo.exception.AnexoNotFound;
import br.com.bradesco.projeto.demo.repository.DocumentoRepository;
import br.com.bradesco.projeto.demo.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;
    private final DocumentoRepository documentoRepository;

    @Override
    public File getById(Long id) {
        return fileRepository.findById(id).orElseThrow(AnexoNotFound::new);
    }

    @Override
    public File save(MultipartFile file, Long id) throws IOException {
        File fileDB = File.builder()
                .data(file.getBytes())
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .build();
        if (documentoRepository.existsById(id)){
            Documento documento = new Documento();
            documento.setId(id);
            fileDB.setDocumento(documento);

            return fileRepository.save(fileDB);
        }
        return fileRepository.save(fileDB);
    }

    @Override
    public List<File> listAll() {
        return IterableUtils.toList(fileRepository.findAll());
    }
}