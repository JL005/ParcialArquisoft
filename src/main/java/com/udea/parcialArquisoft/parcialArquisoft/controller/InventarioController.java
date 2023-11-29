package com.udea.parcialArquisoft.parcialArquisoft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.udea.parcialArquisoft.parcialArquisoft.service.InventarioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/inventarios")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Inventario", description = "El controlador de inventario")
public class InventarioController {

    private final InventarioService inventarioService; 

    @GetMapping("/{idAlmacen}")
    @Operation(summary = "Obtener todos los productos de un almacen")
    public ResponseEntity<?> findAllByIdAlmacen(@PathVariable(name="idAlmacen") long idAlmacen, @RequestHeader("Api-Version") String apiVersion){
        if ("1".equals(apiVersion)) {
            return ResponseEntity.ok(inventarioService.findAllByIdAlmacen(idAlmacen));
        }else{
            return ResponseEntity.ok(inventarioService.findAllByIdAlmacenWithOutInfo(idAlmacen));
        }
    }

    
}
