package br.com.bradesco.projeto.demo.controller;

import br.com.bradesco.projeto.demo.domain.File;
import br.com.bradesco.projeto.demo.dto.FileDTO;
import br.com.bradesco.projeto.demo.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("documentos/{id}")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @PostMapping("/upload")
    @ResponseBody
    public FileDTO uploadFile(@RequestParam("anexo") MultipartFile file, @PathVariable Long id) throws IOException {
        File newFile = fileService.save(file, id);
        return FileDTO.builder()
                .name(newFile.getName())
                .type(newFile.getType())
                .size(newFile.getData().length)
                .url("/documentos/" + newFile.getId() + "/downloads")
                .build();
    }

 /*  @GetMapping("{id}/download")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        File file = fileService.getById(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getName() + "\"")
                .body(file.getData());
    }


    @GetMapping
    @ResponseBody
    public List<FileDTO> listAll() {
        return fileService.listAll().stream().map(file -> FileDTO.builder()
                .name(file.getName())
                .type(file.getType())
                .size(file.getData().length)
                .url("/files/" + file.getId() + "/download")
                .build()).toList();
    }*/

}
