package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduto", nullable = false)
	private Long idProduto;

	@Column(name = "nomeProduto", nullable = false, length = 100)
	private String nomeProduto;

	@Column(name = "preco", nullable = false, length = 50)
	private Double preco;

	@Column(name = "descricaoProduto", nullable = false, length = 100)
	private String descricaoProduto;

	@Column(name = "imgUrl", nullable = false, length = 100)
	private String imgUrl;
	
	@OneToMany(mappedBy = "produto")
	private List<OrnamentoProduto> ornamentosProdutos;
	
	@ManyToOne
	@JoinColumn(name = "id_OrnamentoProduto", nullable = false)
	private OrnamentoProduto ornamentoProduto;
	
	@ManyToOne
	@JoinColumn(name = "idPedidoProduto", nullable = false)
	private PedidoProduto pedidoProduto;
	
	@ManyToOne
	@JoinColumn(name = "idTipoProduto", nullable = false)
	private TipoProduto tipoProduto;
	
	@ManyToOne
	@JoinColumn(name = "idCategoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;

	//Construtores
	public Produto() {

	}
	
	public Produto(Long idProduto, String nomeProduto, Double preco, String descricaoProduto, String imgUrl,
			List<OrnamentoProduto> ornamentosProdutos, OrnamentoProduto ornamentoProduto,
			PedidoProduto pedidoProduto, TipoProduto tipoProduto, CategoriaProduto categoriaProduto) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.descricaoProduto = descricaoProduto;
		this.imgUrl = imgUrl;
		this.ornamentosProdutos = ornamentosProdutos;
		this.ornamentoProduto = ornamentoProduto;
		this.pedidoProduto = pedidoProduto;
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

	public List<OrnamentoProduto> getOrnamentosProdutos() {
		return ornamentosProdutos;
	}

	public void setOrnamentosProdutos(List<OrnamentoProduto> ornamentosProdutos) {
		this.ornamentosProdutos = ornamentosProdutos;
	}

	public OrnamentoProduto getOrnamentoProduto() {
		return ornamentoProduto;
	}

	public void setOrnamentoProduto(OrnamentoProduto ornamentoProduto) {
		this.ornamentoProduto = ornamentoProduto;
	}

	public PedidoProduto getPedidoProduto() {
		return pedidoProduto;
	}

	public void setPedidoProduto(PedidoProduto pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
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