package br.com.bradesco.projeto.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table
@Entity
public class Funcionario {

    @Id
    private Long funcional;
    private String nome;

    @ManyToOne
    private Secao secao;



    public Long getFuncional() {
        return funcional;
    }

    public void setFuncional(Long funcional) {
        this.funcional = funcional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

}
