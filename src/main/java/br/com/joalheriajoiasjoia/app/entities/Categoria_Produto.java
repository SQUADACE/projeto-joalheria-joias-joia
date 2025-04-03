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
	@Column(name = "id_Categoria_Produto", nullable = false)
	private Long id_Categoria_Produto;
	
	@Column(name = "nome_Categoria_Produto", nullable = false, length = 100)
	private String nome_Categoria_Produto;
	
	@Column(name = "descricao_Categoria_Produto", nullable = false, length = 100)
	private String descricao_Categoria_Produto;
	
	//Construtores
	public Categoria_Produto() {
		
	}
	
	public Categoria_Produto(Long id_Categoria_Produto, String nome_Categoria_Produto, String descricao_Categoria_Produto) {
		this.id_Categoria_Produto = id_Categoria_Produto;
		this.nome_Categoria_Produto = nome_Categoria_Produto;
		this.descricao_Categoria_Produto = descricao_Categoria_Produto;
	}

	//Getters e Setters
	public Long getId_Categoria_Produto() {
		return id_Categoria_Produto;
	}

	public void setId_Categoria_Produto(Long id_Categoria_Produto) {
		this.id_Categoria_Produto = id_Categoria_Produto;
	}

	public String getNome_Categoria_Produto() {
		return nome_Categoria_Produto;
	}

	public void setNome_Categoria_Produto(String nome_Categoria_Produto) {
		this.nome_Categoria_Produto = nome_Categoria_Produto;
	}

	public String getDescricao_Categoria_Produto() {
		return descricao_Categoria_Produto;
	}

	public void setDescricao_Categoria_Produto(String descricao_Categoria_Produto) {
		this.descricao_Categoria_Produto = descricao_Categoria_Produto;
	}
}