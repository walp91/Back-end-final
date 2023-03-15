package com.converticshop.controller;

import com.converticshop.model.Usuario;
import com.converticshop.service.ExcepcionUsuario;
import com.converticshop.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable(name = "id") Long idUsuario) {
        return usuarioService.findById(idUsuario);
    }

    @PostMapping("/save")
    public Usuario saveUser(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestBody Usuario usuario) {
        try {
            Boolean checkLogin = usuarioService.login(usuario.getEmail(), usuario.getContrasena());
            return new ResponseEntity<>(checkLogin, HttpStatus.OK);
        } catch (ExcepcionUsuario eu) {


            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }

}
