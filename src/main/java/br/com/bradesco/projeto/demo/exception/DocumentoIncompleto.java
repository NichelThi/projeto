package br.com.bradesco.projeto.demo.exception;

public class DocumentoIncompleto extends RuntimeException {

    public DocumentoIncompleto(){
        super("Documento incompleto");
    }
}
