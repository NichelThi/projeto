package br.com.bradesco.projeto.demo.service;


import br.com.bradesco.projeto.demo.domain.Funcionario;
import br.com.bradesco.projeto.demo.domain.Juncao;
import br.com.bradesco.projeto.demo.domain.Secao;
import br.com.bradesco.projeto.demo.repository.FuncionarioRepository;
import br.com.bradesco.projeto.demo.repository.SecaoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl  implements FuncionarioService{
    private final FuncionarioRepository funcionarioRepository;
    private final SecaoRepository secaoRepository;
    private List<Funcionario> list = new ArrayList<>();

    @Override
    public List<Funcionario> list() {
        return IterableUtils.toList(funcionarioRepository.findAll());
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        Secao secao = secaoRepository.findById(funcionario.getSecao().getId()).get();
        funcionario.setSecao(secao);
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Funcionario getById(Long id) {
        return funcionarioRepository.findById(id).get();
    }

    @Override
    public Funcionario update(Long funcional, Funcionario funcionario) {
        funcionario.setFuncional(funcional);
        int index = list.indexOf(funcionario);
        return list.set(index, funcionario);
    }

    @Override
    public void delete(Long id) {
        funcionarioRepository.deleteById(id);
    }
}

