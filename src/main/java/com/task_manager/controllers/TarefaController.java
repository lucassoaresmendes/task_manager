package com.task_manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task_manager.models.TarefaModel;
import com.task_manager.service.TarefaService;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<TarefaModel> listarTarefas() {
        return tarefaService.listarTarefas();
    }

    @GetMapping("/{id_tarefa}")
    public TarefaModel buscarTarefa(@PathVariable Long id_tarefa) {
        return tarefaService.buscarPorId(id_tarefa);
    }

    @PostMapping
    public TarefaModel criarTarefa(@RequestBody TarefaModel tarefa) {
        return tarefaService.criarTarefa(tarefa);
    }

    @DeleteMapping("/{id_tarefa}")
    public void deletarTarefa(@PathVariable Long id_tarefa) {
        tarefaService.deletarTarefa(id_tarefa);
    }
}
