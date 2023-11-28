package com.udea.parcialArquisoft.parcialArquisoft.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.udea.parcialArquisoft.parcialArquisoft.DTO.InventarioDTO;
import com.udea.parcialArquisoft.parcialArquisoft.model.Inventario;
import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;
import com.udea.parcialArquisoft.parcialArquisoft.repository.InventarioRepositorio;

import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class InventarioService {
    
    private final InventarioRepositorio inventarioRepositorio;

    //GET ID
    public List<Inventario> findAllByIdAlmacen(long idAlmacen){
        return inventarioRepositorio.findAllByIdAlmacen_idAlmacen(idAlmacen);
    }

    public List<Producto> findAllByIdAlmacenWithOutInfo(long idAlmacen){
        List<Inventario> inventarios = inventarioRepositorio.findAllByIdAlmacen_idAlmacen(idAlmacen);
        List<Producto> productos = new ArrayList<>();

        for (int i=0; i<inventarios.size(); i++){
            productos.add(inventarios.get(i).getIdProducto());
        }

        return productos;
    }


}
