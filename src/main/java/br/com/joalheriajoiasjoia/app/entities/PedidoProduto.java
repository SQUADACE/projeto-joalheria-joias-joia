package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class PedidoProduto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedidoProduto", nullable = false)
	private Long idPedidoProduto;
	
	@Column(name = "precoUnitario", nullable = false, unique = true, length = 50)
	private String precoUnitario;

	@Column(name = "quantidade", nullable = false, unique = false, length = 15)
	private Integer quantidade;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idPedido", nullable = false)
	private Pedido pedido;
	
	@OneToMany(mappedBy = "pedidoProduto")
	@JsonManagedReference
	private List<Produto> produtos;
	
	//Construtores
	public PedidoProduto() {
		
	}

	public PedidoProduto(Long idPedidoProduto, String precoUnitario, Integer quantidade, Pedido pedido,
			List<Produto> produtos) {
		this.idPedidoProduto = idPedidoProduto;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
		this.pedido = pedido;
		this.produtos = produtos;
	}

	//Getters e Setters
	public Long getIdPedidoProduto() {
		return idPedidoProduto;
	}

	public void setIdPedidoProduto(Long idPedidoProduto) {
		this.idPedidoProduto = idPedidoProduto;
	}

	public String getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(String precoUnitario) {
		this.precoUnitario = precoUnitario;
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
