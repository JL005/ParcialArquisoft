package com.udea.parcialArquisoft.parcialArquisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udea.parcialArquisoft.parcialArquisoft.model.Inventario;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InventarioRepositorio extends JpaRepository<Inventario, Long>{
    List<Inventario> findAllByIdAlmacen_idAlmacen(long idAlmacen);
}


