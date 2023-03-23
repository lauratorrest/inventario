package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.infrastructure.client.ClienteResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
  Cliente toClienteEntity(ClienteResponse clienteResponse);
}
