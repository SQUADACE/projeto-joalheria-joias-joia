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
	@Column(name = "id_tipo_Usuario", nullable = false)
	private Long id_tipo_Usuario;

	@Column(name = "nome_tipo_Usuario", nullable = false, length = 100)
	private String nome_tipo_Usuario;
	
	//Construtores
	public Tipo_Usuario() {
		
	}
	public Tipo_Usuario(Long id_tipo_Usuario, String nome_tipo_Usuario) {
		this.id_tipo_Usuario = id_tipo_Usuario;
		this.nome_tipo_Usuario = nome_tipo_Usuario;
	}
	
	//Getters e Setters
	public Long getId_tipo_Usuario() {
		return id_tipo_Usuario;
	}
	public void setId_tipo_Usuario(Long id_tipo_Usuario) {
		this.id_tipo_Usuario = id_tipo_Usuario;
	}
	public String getNome_tipo_Usuario() {
		return nome_tipo_Usuario;
	}
	public void setNome_tipo_Usuario(String nome_tipo_Usuario) {
		this.nome_tipo_Usuario = nome_tipo_Usuario;
	}


	
	
}
