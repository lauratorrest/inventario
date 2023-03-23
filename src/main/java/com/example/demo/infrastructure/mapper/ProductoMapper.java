package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Producto;
import com.example.demo.infrastructure.dto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
  Producto toProducto(ProductoDto productoDto);

  ProductoDto toDto(Producto producto);

}
