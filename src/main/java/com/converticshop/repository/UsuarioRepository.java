package com.converticshop.repository;

import com.converticshop.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional <Usuario>  findByEmailAndContrasena(String email, String contrasena);


    }






