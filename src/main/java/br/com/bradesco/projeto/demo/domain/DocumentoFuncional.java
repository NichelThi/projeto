package br.com.bradesco.projeto.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonAppend;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class DocumentoFuncional {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String tipo;
    private Date data_descarte;

    @JsonIgnoreProperties("secao")
    @OneToOne
    private Funcionario funcionario;



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "documento_id")
    private List <Documento> documento;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_descarte() {
        return data_descarte;
    }

    public void setData_descarte(Date data_descarte) {
        this.data_descarte = data_descarte;
    }


    public List<Documento> getDocumento() {
        return documento;
    }

    public void setDocumento(List <Documento> documento) {
        this.documento = documento;
    }


    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
