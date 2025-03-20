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
@Table(name = "tb_endereco")
public class Endereco {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEndereco", nullable = false)
	private Long idEndereco;

	@Column(name = "numeroCasa", nullable = false, length = 4)
	private String numero;

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

	@ManyToOne
	@JoinColumn(name = "USUARIO_id_Usuario")
	private Usuario usuario;

	//Construtores
	public Endereco() {

	}

	public Endereco(Long idEndereco, String numero, String rua, String bairro, String cidade, String cep, String uf,
			String complemento, Usuario usuario) {
		this.idEndereco = idEndereco;
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
		this.complemento = complemento;
		this.usuario = usuario;
	}

	// Getters e Setters
	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
	

}
