package com.example.demo.application;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdate {
  private final ProductoUpdateService productoUpdateService;

  public void updateProducto(Producto producto){
    productoUpdateService.updateProducto(producto);
  }
}
