package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pagamento", nullable = false)
	private Long idPagamento;
	
	@Column(name = "metodo_pagamento", nullable = false)
	private String metodoPagamento;

	@Column(name = "status", nullable = false)
	private String status;
	
	@Column(name = "valor_pago", nullable = false)
	private String valorPago;
	
	//Construtores
	public Pagamento() {
		
	}

	public Pagamento(Long idPagamento, String metodoPagamento, String status, String valorPago) {
		this.idPagamento = idPagamento;
		this.metodoPagamento = metodoPagamento;
		this.status = status;
		this.valorPago = valorPago;
	}

	//Getters e Setters
	public Long getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(Long idPagamento) {
		this.idPagamento = idPagamento;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getValorPago() {
		return valorPago;
	}

	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}
}
