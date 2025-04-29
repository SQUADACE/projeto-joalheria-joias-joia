package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cupom_desconto")
public class Cupom_Desconto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Cupom_Desconto", nullable = false)
	private Long id_Cupom_Desconto;

	@Column(name = "codigo", nullable = false)
	private String codigo;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "desconto", nullable = false)
	private Double desconto;
	
	@Column(name = "validade", nullable = false)
	private LocalDateTime validade;
	
	@OneToMany(mappedBy = "cupom_Desconto")
	private List<Pedido> pedidos;
	
	//Construtores
	public Cupom_Desconto() {
		
	}

	public Cupom_Desconto(Long id_Cupom_Desconto, String codigo, String descricao, Double desconto,
			LocalDateTime validade, List<Pedido> pedidos) {
		this.id_Cupom_Desconto = id_Cupom_Desconto;
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
		this.validade = validade;
		this.pedidos = pedidos;
	}

	//Getters e Setters
	public Long getId_Cupom_Desconto() {
		return id_Cupom_Desconto;
	}

	public void setId_Cupom_Desconto(Long id_Cupom_Desconto) {
		this.id_Cupom_Desconto = id_Cupom_Desconto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public LocalDateTime getValidade() {
		return validade;
	}

	public void setValidade(LocalDateTime validade) {
		this.validade = validade;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
