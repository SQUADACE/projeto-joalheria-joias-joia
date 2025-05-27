package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;
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
@Table(name = "tb_pedido")
public class Pedido {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPedido", nullable = false)
	private Long idPedido;
	
	@Column(name = "dataPedido", nullable = false, unique = true, length = 50)
	private LocalDateTime dataPedido;

	@Column(name = "status", nullable = false, unique = false, length = 15)
	private String status;
	
	@Column(name = "total", nullable = false)
	private Double total;
	
	@OneToMany(mappedBy = "pedido")
	@JsonManagedReference
	private List<PedidoProduto> pedidosProdutos;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idEndereco", nullable = false)
	private Endereco endereco;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idCupomDesconto", nullable = false)
	private CupomDesconto cupomDesconto;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;
	
	//Construtores
	public Pedido() {
		
	}

	public Pedido(Long idPedido, LocalDateTime dataPedido, String status, Double total,
			List<PedidoProduto> pedidosProdutos, Endereco endereco, CupomDesconto cupomDesconto, 
			Usuario usuario) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.status = status;
		this.total = total;
		this.pedidosProdutos = pedidosProdutos;
		this.endereco = endereco;
		this.cupomDesconto = cupomDesconto;
		this.usuario = usuario;
	}

	//Getters e Setters
	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<PedidoProduto> getPedidosProdutos() {
		return pedidosProdutos;
	}

	public void setPedidosProdutos(List<PedidoProduto> pedidosProdutos) {
		this.pedidosProdutos = pedidosProdutos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public CupomDesconto getCupomDesconto() {
		return cupomDesconto;
	}

	public void setCupomDesconto(CupomDesconto cupomDesconto) {
		this.cupomDesconto = cupomDesconto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
