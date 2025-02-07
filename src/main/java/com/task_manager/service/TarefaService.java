package com.task_manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task_manager.models.TarefaModel;
import com.task_manager.repository.TarefaRepository;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaModel> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public TarefaModel buscarPorId(Long id_tarefa) {
        return tarefaRepository.findById(id_tarefa).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    public TarefaModel criarTarefa(TarefaModel tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deletarTarefa(Long id_tarefa) {
        tarefaRepository.deleteById(id_tarefa);
    }
}
