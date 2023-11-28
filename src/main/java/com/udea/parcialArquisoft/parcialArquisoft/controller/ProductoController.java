package com.udea.parcialArquisoft.parcialArquisoft.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.parcialArquisoft.parcialArquisoft.service.ProductoService;

import java.util.List;
import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;


@RestController
@RequestMapping("/api/products")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }
    
    @GetMapping("/get-all")
    public ResponseEntity<List<Producto>> getAllProducts(@RequestHeader("Api-Version") String apiVersion){
        if ("1".equals(apiVersion)) {
            return ResponseEntity.ok(productoService.findAllProducto());
        }else{
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Producto> saveProduct(@RequestHeader("Api-Version") String apiVersion, Producto producto){
        if ("1".equals(apiVersion)) {
            return ResponseEntity.ok(productoService.saveProducto(producto));
        } else {
            return ResponseEntity.badRequest().body(null);
        }
    }
}
