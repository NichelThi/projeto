package br.com.bradesco.projeto.demo.exception;

public class AnexoNotFound extends RuntimeException {

    public AnexoNotFound() {
        super("Arquivo nao anexado");
    }
}