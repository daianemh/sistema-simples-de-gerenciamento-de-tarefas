package com.example.tarefa.service;

import com.example.tarefa.model.Tarefa;
import com.example.tarefa.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() { return repository.findAll(); }
    public Tarefa salvar(Tarefa tarefa) { return repository.save(tarefa); }
    public void deletar(Long id) { repository.deleteById(id); }
}