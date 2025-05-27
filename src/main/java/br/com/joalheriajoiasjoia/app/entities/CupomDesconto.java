package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cupom_desconto")
public class CupomDesconto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCupomDesconto", nullable = false)
	private Long idCupomDesconto;

	@Column(name = "codigo", nullable = false)
	private String codigo;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "desconto", nullable = false)
	private Double desconto;
	
	@Column(name = "validade", nullable = false)
	private LocalDateTime validade;
	
	@OneToMany(mappedBy = "cupomDesconto")
	@JsonManagedReference
	private List<Pedido> pedidos;
	
	//Construtores
	public CupomDesconto() {
		
	}

	public CupomDesconto(Long idCupomDesconto, String codigo, String descricao, Double desconto,
			LocalDateTime validade, List<Pedido> pedidos) {
		this.idCupomDesconto = idCupomDesconto;
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
		this.validade = validade;
		this.pedidos = pedidos;
	}

	//Getters e Setters
	public Long getIdCupomDesconto() {
		return idCupomDesconto;
	}

	public void setIdCupomDesconto(Long idCupomDesconto) {
		this.idCupomDesconto = idCupomDesconto;
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
