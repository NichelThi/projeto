package br.com.bradesco.projeto.demo.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIError {

    private String message;
    private String code;
    private List<FieldErrorDTO> error;
}
