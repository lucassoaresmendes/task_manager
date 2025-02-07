package com.task_manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task_manager.models.UsuarioModel;
import com.task_manager.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public UsuarioModel buscarPorId(Long id_usuario) {
        return usuarioRepository.findById(id_usuario).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public UsuarioModel criarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

}
