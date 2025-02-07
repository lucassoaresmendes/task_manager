package com.task_manager.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tarefa")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TarefaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tarefa;

    private String titulo;
    private String descricao;
    private LocalDateTime dataCriacao = LocalDateTime.now();
    private Boolean concluida;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private UsuarioModel usuario;
}
