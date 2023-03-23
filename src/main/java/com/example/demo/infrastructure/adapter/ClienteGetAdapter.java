package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteGetService;
import com.example.demo.infrastructure.client.ClienteClient;
import com.example.demo.infrastructure.mapper.ClienteMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ClienteGetAdapter implements ClienteGetService {
  private final ClienteMapper clienteMapper;
  private final ClienteClient clienteClient;


  @Override
  public Cliente getCliente(String id) {
    return clienteMapper.toClienteEntity(clienteClient.getCLiente(id));
  }
}
