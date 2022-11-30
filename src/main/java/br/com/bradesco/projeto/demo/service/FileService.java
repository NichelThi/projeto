package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    File getById(Long id);
    File save(MultipartFile file, Long id) throws IOException;
    List<File> listAll();
}
