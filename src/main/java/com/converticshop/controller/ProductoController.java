package com.converticshop.controller;


import com.converticshop.model.Producto;
import com.converticshop.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/all")
    public List<Producto> findAll(){
        return productoService.findAll();
    }


    @GetMapping("/{genero}/{caracteristicas}")
    public ResponseEntity<List<Producto>> buscarPorCaracteristicas(@PathVariable(name = "genero") String genero,
                                                                   @PathVariable(name = "caracteristicas") String categoria) {
        List<Producto> productoList;
        productoList = productoService.buscarPorGeneroYCaracteristicas(genero, categoria);
        return new ResponseEntity<>(productoList, HttpStatus.OK);
    }

    @GetMapping("/{caracteristicas}")
    public ResponseEntity<List<Producto>> buscarPorCaracteristicas(
                                                                   @PathVariable(name = "caracteristicas") String categoria) {
        List<Producto> productoList;
        productoList = productoService.buscarPorCaracteristicas(categoria);
        return new ResponseEntity<>(productoList, HttpStatus.OK);
    }

}



