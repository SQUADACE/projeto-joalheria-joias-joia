package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
	@Column(name = "idTipoUsuario", nullable = false)
	private Long idTipoUsuario;

	@Column(name = "nomeTipoUsuario", nullable = false, length = 100)
	private String nomeTipoUsuario;
	
	@OneToMany(mappedBy = "tipoUsuario")
	@JsonManagedReference
	private List<Usuario> usuarios;
	
	//Construtores
	public Tipo_Usuario() {
		
	}

	public Tipo_Usuario(Long idTipoUsuario, String nomeTipoUsuario, List<Usuario> usuarios) {
		this.idTipoUsuario = idTipoUsuario;
		this.nomeTipoUsuario = nomeTipoUsuario;
		this.usuarios = usuarios;
	}

	//Getters e Setters
	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNomeTipoUsuario() {
		return nomeTipoUsuario;
	}

	public void setNomeTipoUsuario(String nomeTipoUsuario) {
		this.nomeTipoUsuario = nomeTipoUsuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
