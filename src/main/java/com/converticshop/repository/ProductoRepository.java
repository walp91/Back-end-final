package com.converticshop.repository;

import com.converticshop.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository <Producto, Long> {

    public List<Producto> findByCategoria_GeneroContainingIgnoreCaseAndDescripcionContainingIgnoreCase(String genero, String categoria);

    public List<Producto> findByCategoria_GeneroContainingIgnoreCaseAndColorContainingIgnoreCase(String genero, String color);

    public List<Producto> findByCategoria_GeneroContainingIgnoreCaseAndMarca_MarcaContainingIgnoreCase(String genero, String marca);

    public List<Producto> findByCategoria_GeneroContainingIgnoreCaseAndTalla_TallaContainingIgnoreCase(String genero, String talla);


    public List<Producto> findByTalla_TallaContainingIgnoreCase(String talla);

    public List<Producto> findByDescripcionContainingIgnoreCase( String categoria);

    public List<Producto> findByColorContainingIgnoreCase( String color);

    public List<Producto> findByMarca_MarcaContainingIgnoreCase( String marca);

}
