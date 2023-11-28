package com.udea.parcialArquisoft.parcialArquisoft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.udea.parcialArquisoft.parcialArquisoft.model.Inventario;
import com.udea.parcialArquisoft.parcialArquisoft.service.InventarioService;

import java.util.List;

@RestController
@RequestMapping("/inventarios")
@RequiredArgsConstructor
public class InventarioController {

    private final InventarioService inventarioService; 

    @GetMapping("/{idAlmacen}")
    public ResponseEntity<?> findAllByIdAlmacen(@PathVariable(name="idAlmacen") long idAlmacen){
        return ResponseEntity.ok(inventarioService.findAllByIdAlmacen(idAlmacen));
    }
}
