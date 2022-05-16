package io.github.lucasmumbarra.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.lucasmumbarra.vendas.model.Cliente;
import io.github.lucasmumbarra.vendas.repository.ClientesRepository;

@Service
public class ClientesService {

  private ClientesRepository repository;

  public ClientesService( ClientesRepository repository) {
    this.repository = repository;
  }
  
  public void salvarCliente(Cliente cliente) {
    validarCliente(cliente);
    ClientesRepository clientesRepository = new ClientesRepository();
    clientesRepository.persistir(cliente);
  }

  public void validarCliente(Cliente cliente) {
    //aplicar validações
  }
}
