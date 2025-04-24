package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Produto", nullable = false)
	private Long id_Produto;

	@Column(name = "nome_Produto", nullable = false, length = 100)
	private String nome_Produto;

	@Column(name = "preco", nullable = false, length = 50)
	private Double preco;

	@Column(name = "descricao_Produto", nullable = false, length = 100)
	private String descricao_Produto;

	@Column(name = "imgUrl", nullable = false, length = 100)
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "ORNAMENTO_id_Ornamento", nullable = false)
	private Ornamento ornamento;
	
	@ManyToOne
	@JoinColumn(name = "TIPO_PRODUTO_id_Tipo_Produto", nullable = false)
	private Tipo_Produto tipo_Produto;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_PRODUTO_id_Categoria_Produto", nullable = false)
	private Categoria_Produto categoria_Produto;

	//Construtores
	public Produto() {

	}
	
	public Produto(Long id_Produto, String nome_Produto, Double preco, String descricao_Produto, String imgUrl,
			Ornamento ornamento, Tipo_Produto tipo_Produto, Categoria_Produto categoria_Produto) {
		this.id_Produto = id_Produto;
		this.nome_Produto = nome_Produto;
		this.preco = preco;
		this.descricao_Produto = descricao_Produto;
		this.imgUrl = imgUrl;
		this.ornamento = ornamento;
		this.tipo_Produto = tipo_Produto;
		this.categoria_Produto = categoria_Produto;
	}


	//Getters e Setters
	public Long getId_Produto() {
		return id_Produto;
	}
	public void setId_Produto(Long id_Produto) {
		this.id_Produto = id_Produto;
	}
	public String getNome_Produto() {
		return nome_Produto;
	}
	public void setNome_Produto(String nome_Produto) {
		this.nome_Produto = nome_Produto;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDescricao_Produto() {
		return descricao_Produto;
	}
	public void setDescricao_Produto(String descricao_Produto) {
		this.descricao_Produto = descricao_Produto;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Ornamento getOrnamento() {
		return ornamento;
	}

	public void setOrnamento(Ornamento ornamento) {
		this.ornamento = ornamento;
	}

	public Tipo_Produto getTipo_Produto() {
		return tipo_Produto;
	}

	public void setTipo_Produto(Tipo_Produto tipo_Produto) {
		this.tipo_Produto = tipo_Produto;
	}

	public Categoria_Produto getCategoria_Produto() {
		return categoria_Produto;
	}

	public void setCategoria_Produto(Categoria_Produto categoria_Produto) {
		this.categoria_Produto = categoria_Produto;
	}
	
}