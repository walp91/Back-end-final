package com.converticshop.controller;


import com.converticshop.model.Categoria;
import com.converticshop.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categotia")
public class CategoriaController {

    @Autowired
    private Categoria categoria;

    @GetMapping("/all")
    public List<Categoria> findAll (){return CategoriaService.findAll();
    }

}
