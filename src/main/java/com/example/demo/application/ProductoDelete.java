package com.example.demo.application;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteGetService;
import com.example.demo.domain.service.ProductoDeleteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@AllArgsConstructor
@Service
public class ProductoDelete {
  private final ProductoDeleteService productoDeleteService;
  private final ClienteGetService clienteGetService;

  public void deleteProducto(int id, String idCliente){
    Cliente cliente = clienteGetService.getCliente(idCliente);
    productoDeleteService.deleteProduct(id);
    log.info("La compra fue realizada por el usuario con el número de identificación "+idCliente);
  }
}
