package com.converticshop.controller;


import com.converticshop.model.Marca;
import com.converticshop.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {


    @Autowired
    private Marca marca;

    @GetMapping("/all")
    public List<Marca> findAll (){return MarcaService.findAll();
    }
}
