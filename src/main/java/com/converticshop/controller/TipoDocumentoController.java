package com.converticshop.controller;

import com.converticshop.model.TipoDocumento;
import com.converticshop.model.Usuario;
import com.converticshop.service.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/all")
    public List<TipoDocumento> findAll (){
        return tipoDocumentoService.findAll();
    }


}
