package br.com.bradesco.projeto.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;


@Table
@Entity
public class Juncao {

    @Id
    private Long id;
    private String nome;
    private Long codigo;

    @OneToMany(mappedBy = "juncao")
    @JsonIgnoreProperties("juncao")
    private List<Secao> secao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
}
