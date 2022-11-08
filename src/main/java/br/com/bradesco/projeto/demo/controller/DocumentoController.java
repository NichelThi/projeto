package br.com.bradesco.projeto.demo.controller;

import br.com.bradesco.projeto.demo.domain.DocumentoFuncional;
import br.com.bradesco.projeto.demo.service.DocumentoFuncionalService;
import org.springframework.web.bind.annotation.*;
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
@RequestMapping("documentos")
public class DocumentoController {


        private final DocumentoService documentoService;

        public DocumentoController(DocumentoService documentoService) {
            this.documentoService = documentoService;
        }

        @GetMapping("{id}")
        Documento getById(@PathVariable Long id) {
            return documentoService.getById(id);
        }

        @GetMapping
        List<Documento> list() {
            return documentoService.list();
        }

        @PostMapping
        Documento save(@RequestBody Documento documento) {
            return documentoService.save(documento);
        }

        @PutMapping("{id}")
        Documento update(@PathVariable Long id, @RequestBody Documento documento) {
            return documentoService.update(id, documento);
        }

        @DeleteMapping("{id}")
        void delete(@PathVariable Long id) {
            documentoService.delete(id);
        }
    }






