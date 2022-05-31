package io.github.lucasmumbarra.vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.lucasmumbarra.vendas.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
