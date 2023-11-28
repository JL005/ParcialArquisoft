package com.udea.parcialArquisoft.parcialArquisoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;


@Entity
@Table(name = "producto")
@Getter
@Setter
@Builder
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private long idProducto;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "cantidad")
    private int cantidad;
    
}
