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
@Table(name = "tb_ornamento_produto")
public class OrnamentoProduto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrnamentoProduto", nullable = false)
	private Long idOrnamentoProduto;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "idOrnamento", nullable = false)
	private Ornamento ornamento;
	
	@ManyToOne
	@JoinColumn(name = "idProduto", nullable = false)
	private Produto produto;

	//Construtores
	public OrnamentoProduto() {
		
	}

	public OrnamentoProduto(Long idOrnamentoProduto, String nome, String descricao, Ornamento ornamento,
			Produto produto) {
		this.idOrnamentoProduto = idOrnamentoProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.ornamento = ornamento;
		this.produto = produto;
	}

	//Getters e Setters
	public Long getIdOrnamentoProduto() {
		return idOrnamentoProduto;
	}

	public void setIdOrnamentoProduto(Long idOrnamentoProduto) {
		this.idOrnamentoProduto = idOrnamentoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Ornamento getOrnamento() {
		return ornamento;
	}

	public void setOrnamento(Ornamento ornamento) {
		this.ornamento = ornamento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
