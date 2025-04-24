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
	@Column(name = "id_Ornamento", nullable = false)
	private Long id_Ornamento;
	
	@Column(name = "nome_Ornamento", nullable = false, length = 100)
	private String nome_Ornamento;
	
	@Column(name = "descricao_Ornamento", nullable = false, length = 100)
	private String descricao_Ornamento;
	
	@ManyToOne
	@JoinColumn(name = "Produto_id_Produto", nullable = false)
	private Produto produto;
	
	//Construtores
	public Ornamento() {
		
	}
	public Ornamento(Long id_Ornamento, String nome_Ornamento, String descricao_Ornamento, Produto produto) {
		this.id_Ornamento = id_Ornamento;
		this.nome_Ornamento = nome_Ornamento;
		this.descricao_Ornamento = descricao_Ornamento;
		this.produto = produto;
	}
	
	//Getters e Setters
	public Long getId_Ornamento() {
		return id_Ornamento;
	}
	public void setId_Ornamento(Long id_Ornamento) {
		this.id_Ornamento = id_Ornamento;
	}
	public String getNome_Ornamento() {
		return nome_Ornamento;
	}
	public void setNome_Ornamento(String nome_Ornamento) {
		this.nome_Ornamento = nome_Ornamento;
	}
	public String getDescricao_Ornamento() {
		return descricao_Ornamento;
	}
	public void setDescricao_Ornamento(String descricao_Ornamento) {
		this.descricao_Ornamento = descricao_Ornamento;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
	
	
}
