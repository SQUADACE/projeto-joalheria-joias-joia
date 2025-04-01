package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class Tipo_Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_Produto", nullable = false)
	private Long id_tipo_Produto;
	
	@Column(name = "nome_tipo_produto", nullable = false, length = 100)
	private String nome_tipo_produto;

	@Column(name = "descricao_tipo_produto", nullable = false, length = 100)
	private String descricao_tipo_produto;

	//Construtores
	public Tipo_Produto() {

	}
	public Tipo_Produto(Long id_tipo_Produto, String descricao_tipo_produto, String nome_tipo_produto) {
		this.id_tipo_Produto = id_tipo_Produto;
		this.descricao_tipo_produto = descricao_tipo_produto;
		this.nome_tipo_produto = nome_tipo_produto;
	}

	//Getters e Setters
	public Long getId_Tipo_Produto() {
		return id_tipo_Produto;
	}

	public void setId_Tipo_Produto(Long id_tipo_Produto) {
		this.id_tipo_Produto = id_tipo_Produto;
	}

	public String getDescricao_Tipo_Produto() {
		return descricao_tipo_produto;
	}

	public void setDescricao_Tipo_Produto(String descricao_tipo_produto) {
		this.descricao_tipo_produto = descricao_tipo_produto;
	}
	public String getNome_tipo_produto() {
		return nome_tipo_produto;
	}
	public void setNome_tipo_produto(String nome_tipo_produto) {
		this.nome_tipo_produto = nome_tipo_produto;
	}
	

}