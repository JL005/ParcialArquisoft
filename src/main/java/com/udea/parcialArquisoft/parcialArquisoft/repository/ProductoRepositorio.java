package com.udea.parcialArquisoft.parcialArquisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    
}
