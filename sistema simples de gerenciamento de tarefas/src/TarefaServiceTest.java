package com.example.tarefa;

import com.example.tarefa.model.Tarefa;
import com.example.tarefa.repository.TarefaRepository;
import com.example.tarefa.service.TarefaService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class TarefaServiceTest {
    private final TarefaRepository repository = mock(TarefaRepository.class);
    private final TarefaService service = new TarefaService(repository);

    @Test
    void deveListarTarefas() {
        when(repository.findAll()).thenReturn(List.of(new Tarefa()));
        assertFalse(service.listar().isEmpty());
    }
}