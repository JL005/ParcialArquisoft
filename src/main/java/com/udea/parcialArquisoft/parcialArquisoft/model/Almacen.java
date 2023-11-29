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
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Table(name = "almacen")
@Setter
@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Almacen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_almacen")
    private long idAlmacen;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
}
