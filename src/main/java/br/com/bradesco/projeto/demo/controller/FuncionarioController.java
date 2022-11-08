package br.com.bradesco.projeto.demo.controller;

import br.com.bradesco.projeto.demo.domain.Funcionario;
import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.service.FuncionarioService;
import br.com.bradesco.projeto.demo.service.JuncaoService;
import org.springframework.web.bind.annotation.*;
import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.domain.Secao;
import br.com.bradesco.projeto.demo.service.JuncaoService;
import br.com.bradesco.projeto.demo.service.SecaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {


        private final FuncionarioService funcionarioService;

        public FuncionarioController(FuncionarioService funcionarioService) {
            this.funcionarioService = funcionarioService;
        }

        @GetMapping("{id}")
        Funcionario getById(@PathVariable Long funcional) {
            return funcionarioService.getById(funcional);
        }

        @GetMapping
        List<Funcionario> list() {
            return funcionarioService.list();
        }

        @PostMapping
        Funcionario save(@RequestBody Funcionario funcionario) {
            return funcionarioService.save(funcionario);
        }

        @PutMapping("{id}")
        Funcionario update(@PathVariable Long funcional, @RequestBody Funcionario funcionario) {
            return funcionarioService.update(funcional, funcionario);
        }

        @DeleteMapping("{id}")
        void delete(@PathVariable Long funcional) {
            funcionarioService.delete(funcional);
        }
    }




