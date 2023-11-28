package com.udea.parcialArquisoft.parcialArquisoft.service;

import java.util.List;
import com.udea.parcialArquisoft.parcialArquisoft.model.Almacen;

import jakarta.transaction.Transactional;

public interface IAlmacen {

    //GET
    @Transactional
    List<Almacen> findAllAlmacen();

    //GET ID
    @Transactional
    Almacen findAlmacen (Long id);

    //POST
    @Transactional
    Almacen saveAlmacen(Almacen almacen);


}