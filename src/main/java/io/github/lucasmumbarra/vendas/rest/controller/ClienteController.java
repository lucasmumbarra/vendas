package io.github.lucasmumbarra.vendas.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.lucasmumbarra.vendas.domain.entity.Cliente;

@Controller
@RequestMapping( "/api/clientes" )
public class ClienteController {

  @RequestMapping(
    value = { "/hello/{nome}", "/api/hello" }, 
    method = RequestMethod.POST,
    consumes = { "application/json", "application/xml" },
    produces = { "application/json", "application/xml" }
  )
  @ResponseBody
  public Cliente helloCliente(@PathVariable("nome") String nomeCliente, @RequestBody Cliente cliente) {
    return String.format("Hello %s ", nomeCliente);
  }
}
