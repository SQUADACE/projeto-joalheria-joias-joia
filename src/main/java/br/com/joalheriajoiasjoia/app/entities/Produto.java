package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto", nullable = false)
	private Long idProduto;

	@Column(name = "nome_produto", nullable = false, length = 100)
	private String nomeProduto;

	@Column(name = "preco", nullable = false, length = 50)
	private Double preco;

	@Column(name = "descricao_produto", nullable = false)
	private String descricaoProduto;

	@Column(name = "img_url", nullable = false)
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "id_ornamento", nullable = false)
	private Ornamento ornamento;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_produto", nullable = false)
	private TipoProduto tipoProduto;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria_produto", nullable = false)
	private CategoriaProduto categoriaProduto;

	//Construtores
	public Produto() {

	}
	
	public Produto(Long idProduto, String nomeProduto, Double preco, String descricaoProduto, String imgUrl,
			Ornamento ornamento, TipoProduto tipoProduto, CategoriaProduto categoriaProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.descricaoProduto = descricaoProduto;
		this.imgUrl = imgUrl;
		this.ornamento = ornamento;
		this.tipoProduto = tipoProduto;
		this.categoriaProduto = categoriaProduto;
	}

	//Getters e Setters
	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Ornamento getOrnamento() {
		return ornamento;
	}

	public void setOrnamento(Ornamento ornamento) {
		this.ornamento = ornamento;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}
}