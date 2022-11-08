package br.com.bradesco.projeto.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Documento {



    @ManyToMany(mappedBy = "documento")
    @JsonIgnoreProperties("documento")
    private List<DocumentoFuncional> documentoFuncional;
    @Id
    private Long id;
    private String anexo;
    private String nome;
    private String tipo;
    private Date data_documento;
    private Date data_cadastro;

    public List<DocumentoFuncional> getDocumentoFuncional() {
        return documentoFuncional;
    }

    public void setDocumentoFuncional(List<DocumentoFuncional> documentoFuncional) {
        this.documentoFuncional = documentoFuncional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_documento() {
        return data_documento;
    }

    public void setData_documento(Date data_documento) {
        this.data_documento = data_documento;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}
