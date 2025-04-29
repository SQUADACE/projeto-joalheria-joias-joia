package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria_produto")
public class Categoria_Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Categoria_Produto", nullable = false)
	private Long id_Categoria_Produto;
	
	@Column(name = "categoria_Produto", nullable = false, length = 100)
	private String categoria_Produto;
	
	@Column(name = "descricao_Categoria_Produto", nullable = false, length = 100)
	private String descricao_Categoria_Produto;
	
	@OneToMany(mappedBy = "categoria_Produto")
	private List<Produto> produtos;
	
	//Construtores
	public Categoria_Produto() {
		
	}
	
	public Categoria_Produto(Long id_Categoria_Produto, String categoria_Produto, String descricao_Categoria_Produto,
			List<Produto> produtos) {
		this.id_Categoria_Produto = id_Categoria_Produto;
		this.categoria_Produto = categoria_Produto;
		this.descricao_Categoria_Produto = descricao_Categoria_Produto;
		this.produtos = produtos;
	}

	//Getters e Setters
	public Long getId_Categoria_Produto() {
		return id_Categoria_Produto;
	}

	public void setId_Categoria_Produto(Long id_Categoria_Produto) {
		this.id_Categoria_Produto = id_Categoria_Produto;
	}

	public String getCategoria_Produto() {
		return categoria_Produto;
	}

	public void setCategoria_Produto(String categoria_Produto) {
		this.categoria_Produto = categoria_Produto;
	}

	public String getDescricao_Categoria_Produto() {
		return descricao_Categoria_Produto;
	}

	public void setDescricao_Categoria_Produto(String descricao_Categoria_Produto) {
		this.descricao_Categoria_Produto = descricao_Categoria_Produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}