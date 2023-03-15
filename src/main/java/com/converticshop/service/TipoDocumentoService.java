package com.converticshop.service;


import com.converticshop.model.TipoDocumento;
import com.converticshop.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    public List<TipoDocumento> findAll (){
        return tipoDocumentoRepository.findAll();
    }

    public TipoDocumento save(TipoDocumento tipoDocumento){
        return tipoDocumentoRepository.save(tipoDocumento);
    }

}
