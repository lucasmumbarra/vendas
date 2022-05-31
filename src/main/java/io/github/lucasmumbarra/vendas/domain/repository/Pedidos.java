package io.github.lucasmumbarra.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.lucasmumbarra.vendas.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

}
