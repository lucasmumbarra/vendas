package io.github.lucasmumbarra.vendas.domain.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "cliente" )
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Integer id;

  @Column(name = "nome", length = 100)
  private String nome;

  @OneToMany( mappedBy = "cliente", fetch = FetchType.LAZY )
  private Set<Pedido> pedidos;

  public Cliente() {
  }

  public Set<Pedido> getPedidos() {
    return pedidos;
  }

  public Cliente(Integer id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public Cliente(String nome) {
    this.nome = nome;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Cliente {" +
            "id=" + id +
            ", nome='" + nome + '\'' +
            '}';
  }
}
