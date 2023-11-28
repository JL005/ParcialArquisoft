package com.udea.parcialArquisoft.parcialArquisoft.service;

import java.util.List;
import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;

import jakarta.transaction.Transactional;

public interface IProducto {

     //GET
    @Transactional
    List<Producto> findAllProducto();

    //GET ID
    @Transactional
    Producto findProducto (Long id);

    //POST
    @Transactional
    Producto saveProducto(Producto producto);


}