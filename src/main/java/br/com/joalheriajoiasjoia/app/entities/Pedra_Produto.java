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
@Table(name = "tb_pedra_Produto")
public class Pedra_Produto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pedra_Produto", nullable = false)
	private Long idPedra_Produto;
	
	@Column(name = "nome_pedra", nullable = false, length = 100)
	private String nome_pedra;
	
	@Column(name = "descricao_pedra", nullable = false, length = 100)
	private String descricao_pedra;
	
	@ManyToOne
	@JoinColumn(name = "Produto_id_Produto")
	private Produto produto;
	
	//Construtores
	public Pedra_Produto() {
		
	}
	public Pedra_Produto(Long idPedra_Produto, String nome_pedra, String descricao_pedra, Produto produto) {
		this.idPedra_Produto = idPedra_Produto;
		this.nome_pedra = nome_pedra;
		this.descricao_pedra = descricao_pedra;
		this.produto = produto;
	}
	
	//Getters e Setters
	public Long getIdPedra_Produto() {
		return idPedra_Produto;
	}
	public void setIdPedra_Produto(Long idPedra_Produto) {
		this.idPedra_Produto = idPedra_Produto;
	}
	public String getNome_pedra() {
		return nome_pedra;
	}
	public void setNome_pedra(String nome_pedra) {
		this.nome_pedra = nome_pedra;
	}
	public String getDescricao_pedra() {
		return descricao_pedra;
	}
	public void setDescricao_pedra(String descricao_pedra) {
		this.descricao_pedra = descricao_pedra;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
