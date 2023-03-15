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
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    private String nombres;

    private String apellidos;

    private Integer documento;

    @Column(name = "id_tipo_documento")
    private Long idTipoDocumento;


    @Column(name = "correo_electronico")
    private String email;

    private String contrasena;


    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;

}
