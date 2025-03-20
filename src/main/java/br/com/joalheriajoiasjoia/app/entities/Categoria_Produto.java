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
	@Column(name = "idCategoria_Produto", nullable = false)
	private Long idCategoria_Produto;
	
	@Column(name = "nomeCategoria", nullable = false, length = 100)
	private String nomeCategoria;
	
	@Column(name = "descricaoCategoria_Produto", nullable = false, length = 100)
	private String descricaoCategoria_Produto;
	
	//Construtores
	public Categoria_Produto() {
		
	}
	
	public Categoria_Produto(Long idCategoria_Produto, String nomeCategoria, String descricaoCategoria_Produto) {
		this.idCategoria_Produto = idCategoria_Produto;
		this.nomeCategoria = nomeCategoria;
		this.descricaoCategoria_Produto = descricaoCategoria_Produto;
	}

	//Getters e Setters
	public Long getIdCategoria_Produto() {
		return idCategoria_Produto;
	}

	public void setIdCategoria_Produto(Long idCategoria_Produto) {
		this.idCategoria_Produto = idCategoria_Produto;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getDescricaoCategoria_Produto() {
		return descricaoCategoria_Produto;
	}

	public void setDescricaoCategoria_Produto(String descricaoCategoria_Produto) {
		this.descricaoCategoria_Produto = descricaoCategoria_Produto;
	}
}