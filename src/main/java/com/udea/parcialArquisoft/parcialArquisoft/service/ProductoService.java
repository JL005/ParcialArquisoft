package com.udea.parcialArquisoft.parcialArquisoft.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;
import com.udea.parcialArquisoft.parcialArquisoft.repository.ProductoRepositorio;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductoService implements IProducto {
    
private final ProductoRepositorio productoRepositorio;
    
//GET
@Transactional
public List<Producto> findAllProducto() {return productoRepositorio.findAll();}

//GET ID
@Transactional
public Producto findProducto (Long id) {return productoRepositorio.findById(id).orElse(null);}

//POST
@Transactional
public Producto saveProducto (Producto producto) {return productoRepositorio.save(producto);}

}
