package com.udea.parcialArquisoft.parcialArquisoft.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Almacen {
    private Long idAlmacen;
    private String nombre;
    private String direccion;
}
