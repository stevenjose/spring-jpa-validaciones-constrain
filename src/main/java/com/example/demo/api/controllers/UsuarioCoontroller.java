package com.example.demo.api.controllers;

import com.example.demo.api.dto.ErrorDto;
import com.example.demo.api.models.Usuario;
import com.example.demo.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UsuarioCoontroller {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/usuario")
    public ResponseEntity<?> getUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> createUsuario(@Valid @RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

}
