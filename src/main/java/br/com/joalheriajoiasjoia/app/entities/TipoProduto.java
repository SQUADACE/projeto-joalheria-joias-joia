package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_produto")
public class TipoProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_produto", nullable = false)
	private Long idTipoProduto;
	
	@Column(name = "tipo_produto", nullable = false, length = 100)
	private String tipoProduto;

	@Column(name = "descricao_tipo_produto", nullable = false, length = 100)
	private String descricaoTipoProduto;

	//Construtores
	public TipoProduto() {

	}

	public TipoProduto(Long idTipoProduto, String tipoProduto, String descricaoTipoProduto,
			List<Produto> produtos) {
		this.idTipoProduto = idTipoProduto;
		this.tipoProduto = tipoProduto;
		this.descricaoTipoProduto = descricaoTipoProduto;

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
}