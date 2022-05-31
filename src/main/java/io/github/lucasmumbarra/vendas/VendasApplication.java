package io.github.lucasmumbarra.vendas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.lucasmumbarra.vendas.domain.entity.Cliente;
import io.github.lucasmumbarra.vendas.domain.repository.Clientes;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			System.out.println("Salvando clientes");
			clientes.save(new Cliente("Lucas"));
			clientes.save(new Cliente("Outro Cliente"));

			List<Cliente> result = clientes.encontrarPorNome("Lucas");
			result.forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}