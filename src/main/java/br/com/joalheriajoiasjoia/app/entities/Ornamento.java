package br.com.joalheriajoiasjoia.app.entities;

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
@Table(name = "tb_ornamento")
public class Ornamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrnamento", nullable = false)
	private Long idOrnamento;
	
	@Column(name = "nomeOrnamento", nullable = false, length = 100)
	private String nomeOrnamento;
	
	@Column(name = "descricaoOrnamento", nullable = false, length = 100)
	private String descricaoOrnamento;
	
	@OneToMany(mappedBy = "ornamento")
	@JsonManagedReference
	private List<OrnamentoProduto> ornamentosProdutos;
	
	//Construtores
	public Ornamento() {
		
	}

	public Ornamento(Long idOrnamento, String nomeOrnamento, String descricaoOrnamento,
			List<OrnamentoProduto> ornamentosProdutos) {
		this.idOrnamento = idOrnamento;
		this.nomeOrnamento = nomeOrnamento;
		this.descricaoOrnamento = descricaoOrnamento;
		this.ornamentosProdutos = ornamentosProdutos;
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

	public List<OrnamentoProduto> getOrnamentosProdutos() {
		return ornamentosProdutos;
	}

	public void setOrnamentosProdutos(List<OrnamentoProduto> ornamentosProdutos) {
		this.ornamentosProdutos = ornamentosProdutos;
	}
}
