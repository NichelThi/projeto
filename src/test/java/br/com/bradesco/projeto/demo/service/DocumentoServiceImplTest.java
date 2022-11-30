package br.com.bradesco.projeto.demo.service;
import br.com.bradesco.projeto.demo.domain.Documento;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class DocumentoServiceImplTest {

    @Test
    public void testeDeveCriarDocumentoComAnexo() throws Exception {
        System.out.println("testeDeveAcelerarCorretamente");
        // Given
        Carro carro1 = CarroProvider.get();

        // When
        carroService.ligar(carro1);
        carroService.acelerar(carro1, 10);
        carroService.acelerar(carro1, 10);

        Mockito.verify(sistemaDeSeguranca, Mockito.times(1)).travaDeEmergenciaAtivada(Mockito.any(Carro.class));
        Mockito.verify(gps, Mockito.atLeastOnce()).enviarLocalizacao();
        // Then
        assertEquals(20, carro1.getVelocidadeAtual());
    }
}
