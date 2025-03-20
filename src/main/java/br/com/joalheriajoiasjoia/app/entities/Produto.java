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
	@Column(name = "idProduto", nullable = false)
	private Long idProduto;

	@Column(name = "nome_Produto", nullable = false, length = 100)
	private String nome_Produto;

	@Column(name = "preco", nullable = false, length = 50)
	private Double preco;

	@Column(name = "descricao_Produto", nullable = false, length = 100)
	private String descricao_Produto;

	@Column(name = "imagemUrl", nullable = false, length = 100)
	private String imagemUrl;
	
	@ManyToOne
	@JoinColumn(name = "MATERIAL_PRODUTO_id_Material_Produto")
	private Material_Produto tipo_usuario;
	
	@ManyToOne
	@JoinColumn(name = "TIPO_PRODUTO_id_Tipo_Produto")
	private Tipo_Produto tipo_Produto;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORIA_PRODUTO_id_Categoria_Produto")
	private Categoria_Produto categoria_Produto;

	//Construtores
	public Produto() {

	}
	public Produto(Long idProduto, String nome_Produto, Double preco, String descricao_Produto, String imagemUrl) {
		this.idProduto = idProduto;
		this.nome_Produto = nome_Produto;
		this.preco = preco;
		this.descricao_Produto = descricao_Produto;
		this.imagemUrl = imagemUrl;
	}
	
	//Getters e Setters
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
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
	public String getImagemUrl() {
		return imagemUrl;
	}
	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}
}