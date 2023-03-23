package com.example.demo.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Producto {
  private int idProducto;
  private int idCompra;
  private String nombre;
  private double precio;
  private int cantidad;

  public Producto(int idProducto, int idCompra, String nombre, double precio, int cantidad) {
    this.idProducto = idProducto;
    this.idCompra = idCompra;
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }
}
