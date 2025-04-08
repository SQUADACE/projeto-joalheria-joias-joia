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
	@Column(name = "id_Tipo_Produto", nullable = false)
	private Long id_Tipo_Produto;
	
	@Column(name = "tipo_Produto", nullable = false, length = 100)
	private String tipo_Produto;

	@Column(name = "descricao_Tipo_Produto", nullable = false, length = 100)
	private String descricao_Tipo_Produto;

	//Construtores
	public Tipo_Produto() {

	}
	public Tipo_Produto(Long id_Tipo_Produto, String tipo_Produto, String descricao_Tipo_Produto) {
		this.id_Tipo_Produto = id_Tipo_Produto;
		this.descricao_Tipo_Produto = descricao_Tipo_Produto;
		this.tipo_Produto = tipo_Produto;
	}

	//Getters e Setters
	public Long getId_Tipo_Produto() {
		return id_Tipo_Produto;
	}

	public void setId_Tipo_Produto(Long id_Tipo_Produto) {
		this.id_Tipo_Produto = id_Tipo_Produto;
	}

	public String getDescricao_Tipo_Produto() {
		return descricao_Tipo_Produto;
	}

	public void setDescricao_Tipo_Produto(String descricao_Tipo_Produto) {
		this.descricao_Tipo_Produto = descricao_Tipo_Produto;
	}
	public String getTipo_Produto() {
		return tipo_Produto;
	}
	public void setTipo_Produto(String tipo_Produto) {
		this.tipo_Produto = tipo_Produto;
	}
	
}