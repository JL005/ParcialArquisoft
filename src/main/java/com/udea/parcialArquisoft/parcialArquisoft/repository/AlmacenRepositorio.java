package com.udea.parcialArquisoft.parcialArquisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcialArquisoft.parcialArquisoft.model.Almacen;

@Repository
public interface AlmacenRepositorio extends JpaRepository <Almacen, Long>{

}

