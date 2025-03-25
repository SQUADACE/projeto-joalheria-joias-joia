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
@Table(name = "tb_ornamento")
public class Ornamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ornamento", nullable = false)
	private Long id_ornamento;
	
	@Column(name = "nome_ornamento", nullable = false, length = 100)
	private String nome_ornamento;
	
	@Column(name = "descricao_ornamento", nullable = false, length = 100)
	private String descricao_ornamento;
	
	@ManyToOne
	@JoinColumn(name = "Produto_id_Produto")
	private Produto produto;
	
	//Construtores
	public Ornamento() {
		
	}
	public Ornamento(Long id_ornamento, String nome_ornamento, String descricao_ornamento, Produto produto) {
		this.id_ornamento = id_ornamento;
		this.nome_ornamento = nome_ornamento;
		this.descricao_ornamento = descricao_ornamento;
		this.produto = produto;
	}
	
	//Getters e Setters
	public Long getId_ornamento() {
		return id_ornamento;
	}
	public void setId_ornamento(Long id_ornamento) {
		this.id_ornamento = id_ornamento;
	}
	public String getNome_ornamento() {
		return nome_ornamento;
	}
	public void setNome_ornamento(String nome_ornamento) {
		this.nome_ornamento = nome_ornamento;
	}
	public String getDescricao_ornamento() {
		return descricao_ornamento;
	}
	public void setDescricao_ornamento(String descricao_ornamento) {
		this.descricao_ornamento = descricao_ornamento;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
