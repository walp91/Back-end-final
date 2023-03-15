package com.converticshop.service;

public class ExcepcionUsuario extends Exception{

    public ExcepcionUsuario (){
        super("El usuario no se encuentra registrado");
    }
}
