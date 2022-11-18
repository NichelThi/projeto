package br.com.bradesco.projeto.demo.config;
import br.com.bradesco.projeto.demo.exception.AnexoNotFound;
import br.com.bradesco.projeto.demo.exception.DocumentoIncompleto;
import br.com.bradesco.projeto.demo.exception.FuncionarioIncompleto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler({AnexoNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIError anexoNotFound(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("Arquivo nao anexado")
                .build();
        return apiError;
    }
    @ExceptionHandler({FuncionarioIncompleto.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIError funcionarioIncompleto(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("Funcionario incompleto")
                .build();
        return apiError;
    }
    @ExceptionHandler({DocumentoIncompleto.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIError documentoIncompleto(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("Documento incompleto")
                .build();
        return apiError;
    }
}
