package com.converticshop.controller;


import com.converticshop.model.Talla;
import com.converticshop.service.TallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/talla")
public class TallaController {


    @Autowired
    private Talla talla;

    @GetMapping("/all")
    public List<Talla> findAll (){return TallaService.findAll();
    }
}
