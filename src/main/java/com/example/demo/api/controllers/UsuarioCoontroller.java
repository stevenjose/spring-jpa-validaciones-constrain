package com.example.demo.api.controllers;

import com.example.demo.api.dto.ErrorDto;
import com.example.demo.api.models.Usuario;
import com.example.demo.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UsuarioCoontroller {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/usuario")
    public String getUsuarios() {
        return "Usuario";
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> createUsuario(@RequestBody Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
        }catch (Exception e) {
            System.out.println("Error: " + e);
            e.printStackTrace();
            return ResponseEntity.badRequest().body(new ErrorDto("500", e.getMessage()));
        }

        return ResponseEntity.ok(usuario);
    }

}
