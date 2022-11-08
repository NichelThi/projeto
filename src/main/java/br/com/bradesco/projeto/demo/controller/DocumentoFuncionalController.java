package br.com.bradesco.projeto.demo.controller;

import br.com.bradesco.projeto.demo.domain.*;
import br.com.bradesco.projeto.demo.service.*;
import org.springframework.web.bind.annotation.*;
import br.com.bradesco.projeto.demo.domain.Funcionario;
import br.com.bradesco.projeto.demo.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;
import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.service.JuncaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("documentos-funcionais")
public class DocumentoFuncionalController {


        private final DocumentoFuncionalService documentoFuncionalService;

        public DocumentoFuncionalController(DocumentoFuncionalService documentoFuncionalService) {
            this.documentoFuncionalService = documentoFuncionalService;
        }

        @GetMapping("{id}")
        DocumentoFuncional getById(@PathVariable Long id) {
            return documentoFuncionalService.getById(id);
        }

        @GetMapping
        List<DocumentoFuncional> list() {
            return documentoFuncionalService.list();
        }

        @PostMapping
        DocumentoFuncional save(@RequestBody DocumentoFuncional documentoFuncional) {
            return documentoFuncionalService.save(documentoFuncional);
        }

        @PutMapping("{id}")
        DocumentoFuncional update(@PathVariable Long id, @RequestBody DocumentoFuncional documentoFuncional) {
            return documentoFuncionalService.update(id, documentoFuncional);
        }

        @DeleteMapping("{id}")
        void delete(@PathVariable Long id) {
            documentoFuncionalService.delete(id);
        }
    }




