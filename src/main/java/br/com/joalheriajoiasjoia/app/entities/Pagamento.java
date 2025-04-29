package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pagamento", nullable = false)
	private Long id_Pagamento;
	
	@Column(name = "metodo_Pagamento", nullable = false)
	private String metodo_Pagamento;

	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "valor_Pago", nullable = false)
	private String valor_Pago;
	
	@OneToMany(mappedBy = "pagamento")
	private List<Pedido> pedido;
	
	//Construtores
	public Pagamento() {
		
	}

	public Pagamento(Long id_Pagamento, String metodo_Pagamento, String status, String valor_Pago,
			List<Pedido> pedido) {
		this.id_Pagamento = id_Pagamento;
		this.metodo_Pagamento = metodo_Pagamento;
		this.status = status;
		this.valor_Pago = valor_Pago;
		this.pedido = pedido;
	}

	//Getters e Setters
	public Long getId_Pagamento() {
		return id_Pagamento;
	}

	public void setId_Pagamento(Long id_Pagamento) {
		this.id_Pagamento = id_Pagamento;
	}

	public String getMetodo_Pagamento() {
		return metodo_Pagamento;
	}

	public void setMetodo_Pagamento(String metodo_Pagamento) {
		this.metodo_Pagamento = metodo_Pagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValor_Pago() {
		return valor_Pago;
	}

	public void setValor_Pago(String valor_Pago) {
		this.valor_Pago = valor_Pago;
	}

	public List<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
}
