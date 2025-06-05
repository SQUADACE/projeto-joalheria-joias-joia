package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria_produto")
public class CategoriaProduto {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria_produto", nullable = false)
	private Long idCategoriaProduto;

	@Column(name = "categoria_produto", nullable = false, length = 100)
	private String categoriaProduto;

	@Column(name = "descricao_categoria", nullable = false, length = 100)
	private String descricaoCategoria;

	// Construtores
	public CategoriaProduto() {

	}

	public CategoriaProduto(Long idCategoriaProduto, String categoriaProduto, String descricaoCategoria,
			List<Produto> produtos) {
		this.idCategoriaProduto = idCategoriaProduto;
		this.categoriaProduto = categoriaProduto;
		this.descricaoCategoria = descricaoCategoria;
	}

	// Getters e Setters
	public Long getIdCategoriaProduto() {
		return idCategoriaProduto;
	}

	public void setIdCategoriaProduto(Long idCategoriaProduto) {
		this.idCategoriaProduto = idCategoriaProduto;
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}
}