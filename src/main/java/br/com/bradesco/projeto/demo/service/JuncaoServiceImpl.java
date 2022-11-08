package br.com.bradesco.projeto.demo.service;

import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.repository.JuncaoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JuncaoServiceImpl implements JuncaoService{

    private final JuncaoRepository juncaoRepository;
    private List<Juncao> list = new ArrayList<>();

    @Override
    public List<Juncao> list() {
        return IterableUtils.toList(juncaoRepository.findAll());
    }

    @Override
    public Juncao save(Juncao juncao) {
        return juncaoRepository.save(juncao);
    }

    @Override
    public Juncao getById(Long id) {
        return juncaoRepository.findById(id).get();
    }

    @Override
    public Juncao update(Long id, Juncao juncao) {
        juncao.setId(id);
        int index = list.indexOf(juncao);
        return list.set(index, juncao);
    }

    @Override
    public void delete(Long id) {
        juncaoRepository.deleteById(id);
    }
}
