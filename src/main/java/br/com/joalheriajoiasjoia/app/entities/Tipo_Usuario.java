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
@Table(name = "tb_tipo_usuario")
public class Tipo_Usuario {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Tipo_Usuario", nullable = false)
	private Long id_Tipo_Usuario;

	@Column(name = "nome_Tipo_Usuario", nullable = false, length = 100)
	private String nome_Tipo_Usuario;
	
	@OneToMany(mappedBy = "tipo_Usuario")
	private List<Usuario> usuarios;
	
	//Construtores
	public Tipo_Usuario() {
		
	}

	public Tipo_Usuario(Long id_Tipo_Usuario, String nome_Tipo_Usuario, List<Usuario> usuarios) {
		this.id_Tipo_Usuario = id_Tipo_Usuario;
		this.nome_Tipo_Usuario = nome_Tipo_Usuario;
		this.usuarios = usuarios;
	}

	//Getters e Setters
	public Long getId_Tipo_Usuario() {
		return id_Tipo_Usuario;
	}

	public void setId_Tipo_Usuario(Long id_Tipo_Usuario) {
		this.id_Tipo_Usuario = id_Tipo_Usuario;
	}

	public String getNome_Tipo_Usuario() {
		return nome_Tipo_Usuario;
	}

	public void setNome_Tipo_Usuario(String nome_Tipo_Usuario) {
		this.nome_Tipo_Usuario = nome_Tipo_Usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
