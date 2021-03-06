package io.github.lucasmumbarra.vendas.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.lucasmumbarra.vendas.domain.entity.Cliente;
import io.github.lucasmumbarra.vendas.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
  List<Pedido> findByCliente( Cliente cliente);
}
