package com.udea.parcialArquisoft.parcialArquisoft.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.udea.parcialArquisoft.parcialArquisoft.model.Inventario;
import com.udea.parcialArquisoft.parcialArquisoft.repository.InventarioRepositorio;
import java.util.List;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class InventarioService {
    
    private final InventarioRepositorio inventarioRepositorio;

    public List<Inventario> findAllByIdAlmacen(long idAlmacen){
        return inventarioRepositorio.findAllByIdAlmacen_idAlmacen(idAlmacen);
    }
}
