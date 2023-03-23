package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto,Integer> {
  @Query(nativeQuery = true ,value = "update postgres.public.producto_dto set nombre = :nombre, precio = :precio , id_compra = :id_compra, cantidad = :cantidad where id_producto = :id_producto")

  @Modifying
  void updateProducto(@Param("id_producto") int idProducto,
      @Param("nombre") String nombre,
      @Param("precio") double precio,
      @Param("id_compra") int idCompra,
      @Param("cantidad") int cantidad);
}
