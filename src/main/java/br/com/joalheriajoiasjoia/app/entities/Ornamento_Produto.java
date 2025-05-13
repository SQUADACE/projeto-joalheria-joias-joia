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
public class Ornamento_Produto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Ornamento_Produto", nullable = false)
	private Long id_Ornamento_Produto;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "ORNAMENTO_id_Ornamento", nullable = false)
	private Ornamento ornamento;
	
	@ManyToOne
	@JoinColumn(name = "id_Produto", nullable = false)
	private Produto produto;

	//Construtores
	public Ornamento_Produto() {
		
	}

	public Ornamento_Produto(Long id_Ornamento_Produto, String nome, String descricao, Ornamento ornamento,
			Produto produto) {
		this.id_Ornamento_Produto = id_Ornamento_Produto;
		this.nome = nome;
		this.descricao = descricao;
		this.ornamento = ornamento;
		this.produto = produto;
	}

	//Getters e Setters
	public Long getId_Ornamento_Produto() {
		return id_Ornamento_Produto;
	}

	public void setId_Ornamento_Produto(Long id_Ornamento_Produto) {
		this.id_Ornamento_Produto = id_Ornamento_Produto;
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
