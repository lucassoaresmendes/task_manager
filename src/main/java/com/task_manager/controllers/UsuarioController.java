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

import com.task_manager.models.UsuarioModel;
import com.task_manager.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioModel> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id_usuario}")
    public UsuarioModel buscarUsuario(@PathVariable Long id_usuario) {
        return usuarioService.buscarPorId(id_usuario);
    }

    @PostMapping
    public UsuarioModel criarUsuario(@RequestBody UsuarioModel usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @DeleteMapping("/{id_usuario}")
    public void deletarUsuario(@PathVariable Long id_usuario) {
        usuarioService.deletarUsuario(id_usuario);
    }
}
