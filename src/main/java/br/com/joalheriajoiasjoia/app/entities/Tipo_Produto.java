package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class Tipo_Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipo_Produto", nullable = false)
	private Long idTipo_Produto;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	//Construtores
	public Tipo_Produto() {

	}
	public Tipo_Produto(Long idTipo_Produto, String descricao) {
		this.idTipo_Produto = idTipo_Produto;
		this.descricao = descricao;
	}

	//Getters e Setters
	public Long getIdTipo_Produto() {
		return idTipo_Produto;
	}

	public void setIdTipo_Produto(Long idTipo_Produto) {
		this.idTipo_Produto = idTipo_Produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}