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
@Table(name = "tb_categoria_produto")
public class CategoriaProduto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategoriaProduto", nullable = false)
	private Long idCategoriaProduto;
	
	@Column(name = "categoriaProduto", nullable = false, length = 100)
	private String categoriaProduto;
	
	@Column(name = "descricaoCategoriaProduto", nullable = false, length = 100)
	private String descricaoCategoriaProduto;
	
	@OneToMany(mappedBy = "categoriaProduto")
	private List<Produto> produtos;
	
	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long idCategoriaProduto, String categoriaProduto, String descricaoCategoriaProduto,
			List<Produto> produtos) {
		this.idCategoriaProduto = idCategoriaProduto;
		this.categoriaProduto = categoriaProduto;
		this.descricaoCategoriaProduto = descricaoCategoriaProduto;
		this.produtos = produtos;
	}

	//Getters e Setters
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

	public String getDescricaoCategoriaProduto() {
		return descricaoCategoriaProduto;
	}

	public void setDescricaoCategoriaProduto(String descricaoCategoriaProduto) {
		this.descricaoCategoriaProduto = descricaoCategoriaProduto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}