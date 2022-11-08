package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.domain.Secao;
import br.com.bradesco.projeto.demo.repository.JuncaoRepository;
import br.com.bradesco.projeto.demo.repository.SecaoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SecaoServiceImpl implements SecaoService{
    private final SecaoRepository secaoRepository;
    private final JuncaoRepository juncaoRepository;
    @Override
    public List<Secao> list() {
        return IterableUtils.toList(secaoRepository.findAll());
    }

    @Override
    public Secao save(Secao secao) {
        Juncao juncao = juncaoRepository.findById(secao.getJuncao().getId()).get();
        secao.setJuncao(juncao);
        return secaoRepository.save(secao);
    }

    @Override
    public Secao getById(Long id) {
        return secaoRepository.findById(id).get();
    }

    @Override
    public Secao update(Long id, Secao secao) {
        return null;
    }

    @Override
    public void delete(Long id) {
        secaoRepository.deleteById(id);
    }
}
