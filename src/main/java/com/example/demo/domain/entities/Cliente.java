package com.example.demo.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Cliente {
  private String id;
  private String nombre;
  private String apellido;
  private boolean estado;

}
