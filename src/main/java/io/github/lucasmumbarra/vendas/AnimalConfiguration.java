package io.github.lucasmumbarra.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {
  
  @Bean(name = "cachorro")
  public Animal cachorro() {
    return new Animal() {
      @Overridede
      public void fazerBarulho() {
        System.out.println("Au Au");
      }
    };
  }

  @Bean(name = "gato")
  public Animal gato() {
    return new Animal() {
      @Overridede
      public void fazerBarulho() {
        System.out.println("Miau Miau");
      }
    };
  }
}
