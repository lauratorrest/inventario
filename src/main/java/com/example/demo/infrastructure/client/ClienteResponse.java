package com.example.demo.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ClienteResponse {
  private String id;
  private String nombre;
  private String apellido;
  private boolean estado;

}
