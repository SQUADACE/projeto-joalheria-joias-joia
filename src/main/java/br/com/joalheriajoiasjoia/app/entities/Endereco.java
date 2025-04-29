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
@Table(name = "tb_endereco")
public class Endereco {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Endereco", nullable = false)
	private Long id_Endereco;

	@Column(name = "numero_Casa", nullable = false, length = 4)
	private String numero_Casa;

	@Column(name = "rua", nullable = false, length = 100)
	private String rua;

	@Column(name = "bairro", nullable = false, length = 100)
	private String bairro;

	@Column(name = "cidade", nullable = false, length = 50)
	private String cidade;

	@Column(name = "cep", nullable = false, length = 8)
	private String cep;

	@Column(name = "uf", nullable = false, length = 2)
	private String uf;

	@Column(name = "complemento", nullable = false, length = 100)
	private String complemento;

	@OneToMany(mappedBy = "endereco")
	private List<Pedido> pedidos;
	
	@ManyToOne
	@JoinColumn(name = "id_Usuario")
	private Usuario usuario;

	//Construtores
	public Endereco() {

	}

	public Endereco(Long id_Endereco, String numero_Casa, String rua, String bairro, String cidade, String cep,
			String uf, String complemento, List<Pedido> pedidos, Usuario usuario) {
		this.id_Endereco = id_Endereco;
		this.numero_Casa = numero_Casa;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.complemento = complemento;
		this.pedidos = pedidos;
		this.usuario = usuario;
	}
	
	// Getters e Setters
	public Long getId_Endereco() {
		return id_Endereco;
	}

	public void setId_Endereco(Long id_Endereco) {
		this.id_Endereco = id_Endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNumero_Casa() {
		return numero_Casa;
	}

	public void setNumero_Casa(String numero_Casa) {
		this.numero_Casa = numero_Casa;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
}
