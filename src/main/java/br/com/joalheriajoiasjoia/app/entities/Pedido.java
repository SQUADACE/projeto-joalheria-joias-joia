package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;
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
@Table(name = "tb_pedido")
public class Pedido {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pedido", nullable = false)
	private Long id_Pedido;
	
	@Column(name = "data_Pedido", nullable = false, unique = true, length = 50)
	private LocalDateTime data_Pedido;

	@Column(name = "status", nullable = false, unique = false, length = 15)
	private String status;
	
	@Column(name = "total", nullable = false)
	private Double total;
	
	@OneToMany(mappedBy = "pedido")
	private List<Pedido_Produto> pedidos_Produtos;
	
	@OneToMany(mappedBy = "pedido")
	private List<Pagamento> pagamentos;
	
	@ManyToOne
	@JoinColumn(name = "id_Endereco", nullable = false)
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "id_Cupom_Desconto", nullable = false)
	private Cupom_Desconto cupom_Desconto;
	
	@ManyToOne
	@JoinColumn(name = "id_Usuario", nullable = false)
	private Usuario usuario;
	
	//Construtores
	public Pedido() {
		
	}

	public Pedido(Long id_Pedido, LocalDateTime data_Pedido, String status, Double total,
			List<Pedido_Produto> pedidos_Produtos, List<Pagamento> pagamentos, Endereco endereco,
			Cupom_Desconto cupom_Desconto, Usuario usuario) {
		this.id_Pedido = id_Pedido;
		this.data_Pedido = data_Pedido;
		this.status = status;
		this.total = total;
		this.pedidos_Produtos = pedidos_Produtos;
		this.pagamentos = pagamentos;
		this.endereco = endereco;
		this.cupom_Desconto = cupom_Desconto;
		this.usuario = usuario;
	}

	//Getters e Setters
	public Long getId_Pedido() {
		return id_Pedido;
	}

	public void setId_Pedido(Long id_Pedido) {
		this.id_Pedido = id_Pedido;
	}

	public LocalDateTime getData_Pedido() {
		return data_Pedido;
	}

	public void setData_Pedido(LocalDateTime data_Pedido) {
		this.data_Pedido = data_Pedido;
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

	public List<Pedido_Produto> getPedidos_Produtos() {
		return pedidos_Produtos;
	}

	public void setPedidos_Produtos(List<Pedido_Produto> pedidos_Produtos) {
		this.pedidos_Produtos = pedidos_Produtos;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cupom_Desconto getCupom_Desconto() {
		return cupom_Desconto;
	}

	public void setCupom_Desconto(Cupom_Desconto cupom_Desconto) {
		this.cupom_Desconto = cupom_Desconto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
