package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_produto")
public class Pedido_Produto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pedido_Produto", nullable = false)
	private Long id_Pedido_Produto;
	
	@Column(name = "preco_Unitario", nullable = false, unique = true, length = 50)
	private String preco_Unitario;

	@Column(name = "quantidade", nullable = false, unique = false, length = 15)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "PEDIDO_id_Pedido", nullable = false)
	private Pedido pedido;
	
	@OneToMany(mappedBy = "pedido_Produto")
	private List<Produto> produtos;
	
	//Construtores
	public Pedido_Produto() {
		
	}

	public Pedido_Produto(Long id_Pedido_Produto, String preco_Unitario, Integer quantidade, Pedido pedido,
			List<Produto> produtos) {
		this.id_Pedido_Produto = id_Pedido_Produto;
		this.preco_Unitario = preco_Unitario;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produtos = produtos;
	}

	//Getters e Setters
	public Long getId_Pedido_Produto() {
		return id_Pedido_Produto;
	}

	public void setId_Pedido_Produto(Long id_Pedido_Produto) {
		this.id_Pedido_Produto = id_Pedido_Produto;
	}

	public String getPreco_Unitario() {
		return preco_Unitario;
	}

	public void setPreco_Unitario(String preco_Unitario) {
		this.preco_Unitario = preco_Unitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
