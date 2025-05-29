package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamento")
public class Ornamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ornamento", nullable = false)
	private Long idOrnamento;
	
	@Column(name = "nome_ornamento", nullable = false, length = 100)
	private String nomeOrnamento;
	
	@Column(name = "descricao_ornamento", nullable = false, length = 100)
	private String descricaoOrnamento;
	
	//Construtores
	public Ornamento() {
		
	}

	public Ornamento(Long idOrnamento, String nomeOrnamento, String descricaoOrnamento) {
		this.idOrnamento = idOrnamento;
		this.nomeOrnamento = nomeOrnamento;
		this.descricaoOrnamento = descricaoOrnamento;
	}

	//Getters e Setters
	public Long getIdOrnamento() {
		return idOrnamento;
	}

	public void setIdOrnamento(Long idOrnamento) {
		this.idOrnamento = idOrnamento;
	}

	public String getNomeOrnamento() {
		return nomeOrnamento;
	}

	public void setNomeOrnamento(String nomeOrnamento) {
		this.nomeOrnamento = nomeOrnamento;
	}

	public String getDescricaoOrnamento() {
		return descricaoOrnamento;
	}

	public void setDescricaoOrnamento(String descricaoOrnamento) {
		this.descricaoOrnamento = descricaoOrnamento;
	}
}
