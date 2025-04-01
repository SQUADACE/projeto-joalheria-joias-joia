package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id_usuario;

	@Column(name = "nome_usuario",  length = 100)
	private String nome_usuario;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@Column(name = "telefone", nullable = false, unique = false, length = 15)
	private String telefone;

	@Column(name = "data_nascimento", nullable = true, unique = false)
	private LocalDate data_nascimento;
	
	@Column(name = "senha", nullable = true)
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "TIPO_USUARIO_id_Tipo_Usuario")
	private Tipo_Usuario tipo_usuario;

	// Construtores
	public Usuario() {

	}
	public Usuario(Long id_usuario, String nome_usuario, String cpf, String email, String telefone,
			LocalDate data_nascimento, String senha, Tipo_Usuario tipo_usuario) {
		this.id_usuario = id_usuario;
		this.nome_usuario = nome_usuario;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.data_nascimento = data_nascimento;
		this.senha = senha;
		this.tipo_usuario = tipo_usuario;
	}
	
	//Getters e Setters
	public Long getId_Usuario() {
		return id_usuario;
	}
	public void setId_Usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_Usuario() {
		return nome_usuario;
	}
	public void setNome_Usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
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
	public LocalDate getData_Nascimento() {
		return data_nascimento;
	}
	public void setData_Nascimento(LocalDate data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Tipo_Usuario getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(Tipo_Usuario tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
}