package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
@Table(name = "tb_usuario")
public class Usuario {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long idUsuario;

	@Column(name = "nome_usuario",  length = 100)
	private String nomeUsuario;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@Column(name = "telefone", nullable = false, unique = false, length = 15)
	private String telefone;

	@Column(name = "data_nascimento", nullable = true, unique = false)
	private LocalDate dataNascimento;
	
	@Column(name = "senha", nullable = true)
	private String senha;
	
	@OneToMany(mappedBy = "usuario")
	private List<Endereco> enderecos;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_usuario")
	@JsonBackReference
	private TipoUsuario tipoUsuario;

	// Construtores
	public Usuario() {

	}
	
	public Usuario(Long idUsuario, String nomeUsuario, String cpf, String email, String telefone,
			LocalDate dataNascimento, String senha, List<Endereco> enderecos,TipoUsuario tipoUsuario) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.enderecos = enderecos;
		this.tipoUsuario = tipoUsuario;
	}

	//Getters e Setters
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}