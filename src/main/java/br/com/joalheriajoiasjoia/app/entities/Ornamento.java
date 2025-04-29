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
@Table(name = "tb_ornamento")
public class Ornamento {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Ornamento", nullable = false)
	private Long id_Ornamento;
	
	@Column(name = "nome_Ornamento", nullable = false, length = 100)
	private String nome_Ornamento;
	
	@Column(name = "descricao_Ornamento", nullable = false, length = 100)
	private String descricao_Ornamento;
	
	@OneToMany(mappedBy = "ornamento")
	private List<Ornamento_Produto> ornamentos_Produtos;
	
	//Construtores
	public Ornamento() {
		
	}

	public Ornamento(Long id_Ornamento, String nome_Ornamento, String descricao_Ornamento,
			List<Ornamento_Produto> ornamentos_Produtos) {
		super();
		this.id_Ornamento = id_Ornamento;
		this.nome_Ornamento = nome_Ornamento;
		this.descricao_Ornamento = descricao_Ornamento;
		this.ornamentos_Produtos = ornamentos_Produtos;
	}

	//Getters e Setters
	public Long getId_Ornamento() {
		return id_Ornamento;
	}
	public void setId_Ornamento(Long id_Ornamento) {
		this.id_Ornamento = id_Ornamento;
	}
	public String getNome_Ornamento() {
		return nome_Ornamento;
	}
	public void setNome_Ornamento(String nome_Ornamento) {
		this.nome_Ornamento = nome_Ornamento;
	}
	public String getDescricao_Ornamento() {
		return descricao_Ornamento;
	}
	public void setDescricao_Ornamento(String descricao_Ornamento) {
		this.descricao_Ornamento = descricao_Ornamento;
	}

	public List<Ornamento_Produto> getOrnamentos_Produtos() {
		return ornamentos_Produtos;
	}

	public void setOrnamentos_Produtos(List<Ornamento_Produto> ornamentos_Produtos) {
		this.ornamentos_Produtos = ornamentos_Produtos;
	}
}
