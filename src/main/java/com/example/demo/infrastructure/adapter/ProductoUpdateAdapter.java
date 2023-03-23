package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Producto;
import com.example.demo.domain.service.ProductoUpdateService;
import com.example.demo.infrastructure.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdateAdapter implements ProductoUpdateService {
  private final ProductoRepository productoRepository;

  @Transactional
  public void updateProducto(Producto producto) {
    productoRepository.updateProducto(producto.getIdProducto(),producto.getNombre(),producto.getPrecio(),producto.getIdCompra(), producto.getCantidad());
  }
}
