package com.udea.parcialArquisoft.parcialArquisoft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.Builder;


@Setter
@Getter
@Entity
@Table(name="inventario")
@Builder
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_inventario")
    private long idInventario;
    
    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto idProducto;

    @ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen idAlmacen;

}
