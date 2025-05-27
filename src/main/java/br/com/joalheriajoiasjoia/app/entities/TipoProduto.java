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
@Table(name = "tb_tipo_produto")
public class TipoProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoProduto", nullable = false)
	private Long idTipoProduto;
	
	@Column(name = "tipoProduto", nullable = false, length = 100)
	private String tipoProduto;

	@Column(name = "descricaoTipoProduto", nullable = false, length = 100)
	private String descricaoTipoProduto;
	
	@OneToMany(mappedBy = "tipoProduto")
	@JsonManagedReference
	private List<Produto> produtos;

	//Construtores
	public TipoProduto() {

	}

	public TipoProduto(Long idTipoProduto, String tipoProduto, String descricaoTipoProduto,
			List<Produto> produtos) {
		this.idTipoProduto = idTipoProduto;
		this.tipoProduto = tipoProduto;
		this.descricaoTipoProduto = descricaoTipoProduto;
		this.produtos = produtos;
	}

	//Getters e Setters
	public Long getIdTipoProduto() {
		return idTipoProduto;
	}

	public void setIdTipoProduto(Long idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricaoTipoProduto() {
		return descricaoTipoProduto;
	}

	public void setDescricaoTipoProduto(String descricaoTipoProduto) {
		this.descricaoTipoProduto = descricaoTipoProduto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}	
}