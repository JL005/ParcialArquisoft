package com.udea.parcialArquisoft.parcialArquisoft.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventarioDTO {
    private long idInventario;
    private long idProducto;
    private long idAlmacen;
    private String nombreProducto;
    private int cantidad;
    
}
