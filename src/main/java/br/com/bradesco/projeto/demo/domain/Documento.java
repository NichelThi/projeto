package br.com.bradesco.projeto.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table
public class Documento {


    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    @OneToOne
    private File anexo;
    @NotBlank(message = "Nome obrigatório.")
    private String nome;
    @NotBlank(message = "Tipo documento obrigatório.")
    private String tipo;
    @NotNull(message = "Data do documento obrigatória.")
    private Date data_documento;
    @NotNull(message = "Data do cadastro obrigatória.")
    private Date data_cadastro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getAnexo() {
        return anexo;
    }

    public void setAnexo(File anexo) {
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
