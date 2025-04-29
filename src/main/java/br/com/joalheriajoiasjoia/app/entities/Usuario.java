package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDate;
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
@Table(name = "tb_usuario")
public class Usuario {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Usuario", nullable = false)
	private Long id_Usuario;

	@Column(name = "nome_Usuario",  length = 100)
	private String nome_Usuario;

	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;

	@Column(name = "email", nullable = false, unique = true, length = 50)
	private String email;

	@Column(name = "telefone", nullable = false, unique = false, length = 15)
	private String telefone;

	@Column(name = "data_Nascimento", nullable = true, unique = false)
	private LocalDate data_Nascimento;
	
	@Column(name = "senha", nullable = true)
	private String senha;
	
	@OneToMany(mappedBy = "usuario")
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "usuario")
	private List<Pedido> pedidos;
	
	@ManyToOne
	@JoinColumn(name = "id_Tipo_Usuario")
	private Tipo_Usuario tipo_Usuario;

	// Construtores
	public Usuario() {

	}
	
	public Usuario(Long id_Usuario, String nome_Usuario, String cpf, String email, String telefone,
			LocalDate data_Nascimento, String senha, List<Endereco> enderecos, List<Pedido> pedidos,
			Tipo_Usuario tipo_Usuario) {
		this.id_Usuario = id_Usuario;
		this.nome_Usuario = nome_Usuario;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.data_Nascimento = data_Nascimento;
		this.senha = senha;
		this.enderecos = enderecos;
		this.pedidos = pedidos;
		this.tipo_Usuario = tipo_Usuario;
	}

	//Getters e Setters
	public Long getId_Usuario() {
		return id_Usuario;
	}

	public void setId_Usuario(Long id_Usuario) {
		this.id_Usuario = id_Usuario;
	}

	public String getNome_Usuario() {
		return nome_Usuario;
	}

	public void setNome_Usuario(String nome_Usuario) {
		this.nome_Usuario = nome_Usuario;
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
		return data_Nascimento;
	}

	public void setData_Nascimento(LocalDate data_Nascimento) {
		this.data_Nascimento = data_Nascimento;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Tipo_Usuario getTipo_Usuario() {
		return tipo_Usuario;
	}

	public void setTipo_Usuario(Tipo_Usuario tipo_Usuario) {
		this.tipo_Usuario = tipo_Usuario;
	}
}