package com.converticshop.service;

import com.converticshop.model.Usuario;
import com.converticshop.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    //guardar usuario nuevo
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


    //Mostrar todos los usuarios
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    //buscar usuario por id
    public Usuario findById(Long idUsuario) {
        return usuarioRepository.findById(idUsuario).orElse(null);
    }

    //Buscar correo y contraseña validados
    public Boolean login(String email, String contrasena) throws ExcepcionUsuario {
        Usuario usuario = usuarioRepository.findByEmailAndContrasena(email, contrasena).orElseThrow(ExcepcionUsuario::new);
        return usuario != null;
    }
}
