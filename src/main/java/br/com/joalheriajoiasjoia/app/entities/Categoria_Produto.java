package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria_produto")
public class Categoria_Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria_produto", nullable = false)
	private Long id_categoria_produto;
	
	@Column(name = "nome_categoria_produto", nullable = false, length = 100)
	private String nome_categoria_produto;
	
	@Column(name = "descricao_categoria_produto", nullable = false, length = 100)
	private String descricao_categoria_produto;
	
	//Construtores
	public Categoria_Produto() {
		
	}
	
	public Categoria_Produto(Long id_categoria_produto, String nome_categoria_produto, String descricao_categoria_produto) {
		this.id_categoria_produto = id_categoria_produto;
		this.nome_categoria_produto = nome_categoria_produto;
		this.descricao_categoria_produto = descricao_categoria_produto;
	}

	//Getters e Setters
	public Long getId_Categoria_Produto() {
		return id_categoria_produto;
	}

	public void setId_Categoria_Produto(Long id_categoria_produto) {
		this.id_categoria_produto = id_categoria_produto;
	}

	public String getNome_Categoria_Produto() {
		return nome_categoria_produto;
	}

	public void setNome_Categoria_Produto(String nome_categoria_produto) {
		this.nome_categoria_produto = nome_categoria_produto;
	}

	public String getDescricao_Categoria_Produto() {
		return descricao_categoria_produto;
	}

	public void setDescricao_Categoria_Produto(String descricao_categoria_produto) {
		this.descricao_categoria_produto = descricao_categoria_produto;
	}
}