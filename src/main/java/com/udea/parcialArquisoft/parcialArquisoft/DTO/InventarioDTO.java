package com.udea.parcialArquisoft.parcialArquisoft.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import com.udea.parcialArquisoft.parcialArquisoft.model.Producto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InventarioDTO {
    private Long idInventario;
    private Producto producto;
    private Almacen almacen;
}
