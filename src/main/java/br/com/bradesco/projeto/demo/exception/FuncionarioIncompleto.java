package br.com.bradesco.projeto.demo.exception;

public class FuncionarioIncompleto extends RuntimeException {
    public FuncionarioIncompleto(){
        super("Funcionario incompleto");
    }
}


