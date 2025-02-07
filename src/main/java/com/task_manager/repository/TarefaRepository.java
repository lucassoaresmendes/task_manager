package com.task_manager.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.task_manager.models.TarefaModel;

public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
    Optional<TarefaModel> findByTitulo(String titulo);
}
