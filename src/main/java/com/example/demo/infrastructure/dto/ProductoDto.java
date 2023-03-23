package com.example.demo.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ProductoDto {
  @Id
  private int idProducto;
  private int idCompra;
  private String nombre;
  private double precio;
  private int cantidad;
}
