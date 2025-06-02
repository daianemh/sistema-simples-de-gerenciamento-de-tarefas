package com.example.tarefa.controller;

import com.example.tarefa.model.Tarefa;
import com.example.tarefa.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController { // A classe precisa ser declarada corretamente
    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() { return service.listar(); }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) { return service.salvar(tarefa); }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) { service.deletar(id); }
}