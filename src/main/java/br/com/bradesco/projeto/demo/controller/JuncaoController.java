package br.com.bradesco.projeto.demo.controller;

import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.domain.Secao;
import br.com.bradesco.projeto.demo.service.JuncaoService;
import br.com.bradesco.projeto.demo.service.SecaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("juncoes")
public class JuncaoController {

    private final JuncaoService juncaoService;

    public JuncaoController(JuncaoService juncaoService) {
        this.juncaoService = juncaoService;
    }

    @GetMapping("{id}")
    Juncao getById(@PathVariable Long id) {
        return juncaoService.getById(id);
    }

    @GetMapping
    List<Juncao> list() {
        return juncaoService.list();
    }

    @PostMapping
    Juncao save(@RequestBody Juncao juncao) {
        return juncaoService.save(juncao);
    }

    @PutMapping("{id}")
    Juncao update(@PathVariable Long id, @RequestBody Juncao juncao) {
        return juncaoService.update(id, juncao);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id) {
        juncaoService.delete(id);
    }
}


