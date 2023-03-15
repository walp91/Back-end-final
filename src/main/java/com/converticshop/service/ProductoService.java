package com.converticshop.service;

import com.converticshop.model.Producto;
import com.converticshop.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return productoRepository.findAll();
    }
    public Optional<Producto> findById (Long id){
        return productoRepository.findById(id);
    }

    public List<Producto> buscarPorGeneroYCaracteristicas(String genero, String categoria){

        List<Producto> listaProductos;
        List<Producto> generoYDescripcion= productoRepository.findByCategoria_GeneroContainingIgnoreCaseAndDescripcionContainingIgnoreCase(genero, categoria);
        List<Producto> generoYColor= productoRepository.findByCategoria_GeneroContainingIgnoreCaseAndColorContainingIgnoreCase(genero, categoria);
        List<Producto> generoYMarca= productoRepository.findByCategoria_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(genero, categoria);
        List<Producto> generoYTalla= productoRepository.findByCategoria_GeneroContainingIgnoreCaseAndTalla_TallaContainingIgnoreCase(genero, categoria);
        if(!generoYDescripcion.isEmpty()){
            listaProductos =generoYDescripcion;
        } else if (!generoYColor.isEmpty()) {
            listaProductos =generoYColor;
        } else if (!generoYMarca.isEmpty()) {
            listaProductos =generoYMarca;
        } else  {
            listaProductos =generoYTalla;
        }
        return listaProductos;
    }

    public List<Producto> buscarPorCaracteristicas(String categoria){

        List<Producto> listaProductos;
        List<Producto> Descripcion= productoRepository.findByDescripcionContainingIgnoreCase(categoria);
        List<Producto> Color= productoRepository.findByColorContainingIgnoreCase(categoria);
        List<Producto> Marca= productoRepository.findByMarca_MarcaContainingIgnoreCase(categoria);
        List<Producto> Talla= productoRepository.findByTalla_TallaContainingIgnoreCase(categoria);
        if(!Descripcion.isEmpty()){
            listaProductos =Descripcion;
        } else if (!Color.isEmpty()) {
            listaProductos =Color;
        } else if (!Marca.isEmpty()) {
            listaProductos =Marca;
        } else  {
            listaProductos =Talla;
        }
        return listaProductos;
    }
}
