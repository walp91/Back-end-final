package com.converticshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_producto;

    private String descripcion;

    private Long id_marca;

    private Long id_talla;

    private String color;

    private Integer valor_unitario;

    private Integer cantidad_disponible;

    private Long id_categoria;

    private String imagen;

    private Integer mas_buscados;


    @ManyToOne
    @JoinColumn(name = "id_marca", insertable = false, updatable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "id_talla", insertable = false, updatable = false)
    private Talla talla;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;
}
