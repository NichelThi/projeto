package br.com.bradesco.projeto.demo.controller;


import br.com.bradesco.projeto.demo.domain.Secao;
import br.com.bradesco.projeto.demo.service.SecaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("secoes")
public class SecaoController {

    private final SecaoService secaoService;

    public SecaoController(SecaoService secaoService) {
        this.secaoService = secaoService;
    }

    @GetMapping("{id}")
    Secao getById(@PathVariable Long id) {
        return secaoService.getById(id);
    }

    @GetMapping
    List<Secao> list() {
        return secaoService.list();
    }

    @PostMapping
    Secao save(@RequestBody Secao secao) {
        return secaoService.save(secao);
    }

    @PutMapping("{id}")
    Secao update(@PathVariable Long id, @RequestBody Secao secao) {
        return secaoService.update(id, secao);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id){
        secaoService.delete(id);
    }
}
