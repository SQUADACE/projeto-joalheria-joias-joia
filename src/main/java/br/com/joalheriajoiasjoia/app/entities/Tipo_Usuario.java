package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipo_usuario")
public class Tipo_Usuario {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipo_Usuario", nullable = false)
	private Long idTipo_Usuario;

	@Column(name = "nomeUsuario", nullable = false, length = 100)
	private String nomeTipo_Usuario;
	
	//Construtores
	public Tipo_Usuario() {
		
	}
	public Tipo_Usuario(Long idTipo_Usuario, String nomeTipo_Usuario) {
		this.idTipo_Usuario = idTipo_Usuario;
		this.nomeTipo_Usuario = nomeTipo_Usuario;
	}
	
	//Getters e Setters
	public Long getIdTipo_Usuario() {
		return idTipo_Usuario;
	}
	public void setIdTipo_Usuario(Long idTipo_Usuario) {
		this.idTipo_Usuario = idTipo_Usuario;
	}
	public String getNomeTipo_Usuario() {
		return nomeTipo_Usuario;
	}
	public void setNomeTipo_Usuario(String nomeTipo_Usuario) {
		this.nomeTipo_Usuario = nomeTipo_Usuario;
	}
	
}
