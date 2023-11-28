package com.udea.parcialArquisoft.parcialArquisoft.service;

import com.udea.parcialArquisoft.parcialArquisoft.repository.AlmacenRepositorio;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.udea.parcialArquisoft.parcialArquisoft.model.Almacen;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AlmacenService implements IAlmacen{
    
    private final AlmacenRepositorio almacenRepositorio;

    //GET
    @Transactional
    public List<Almacen> findAllAlmacen() {return almacenRepositorio.findAll();} 

    //GET ID
    @Override
    @Transactional
    public Almacen findAlmacen (Long id) {return almacenRepositorio.findById(id).orElse(null);}

    //POST
    @Override
    @Transactional
    public Almacen saveAlmacen (Almacen almacen) {return almacenRepositorio.save(almacen);}

}
