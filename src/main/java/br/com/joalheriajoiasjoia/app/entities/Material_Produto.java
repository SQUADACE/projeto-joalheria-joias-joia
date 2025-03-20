package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_material_produto")
public class Material_Produto {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMaterial_Produto", nullable = false)
	private Long idMaterial_Produto;
	
	@Column(name = "nomeMaterial_Produto", nullable = false, length = 100)
	private String nomeMaterial_Produto;
	
	@Column(name = "descricaoMaterial_Produto", nullable = false, length = 50)
	private String descricaoMaterial_Produto;
	
	//Construtores
	public Material_Produto() {
		
	}
	
	public Material_Produto(Long idMaterial_Produto, String nomeMaterial_Produto, String descricaoMaterial_Produto) {
		this.idMaterial_Produto = idMaterial_Produto;
		this.nomeMaterial_Produto = nomeMaterial_Produto;
		this.descricaoMaterial_Produto = descricaoMaterial_Produto;
	}

	//Getters e Setters
	public Long getIdMaterial_Produto() {
		return idMaterial_Produto;
	}

	public void setIdMaterial_Produto(Long idMaterial_Produto) {
		this.idMaterial_Produto = idMaterial_Produto;
	}

	public String getNomeMaterial_Produto() {
		return nomeMaterial_Produto;
	}

	public void setNomeMaterial_Produto(String nomeMaterial_Produto) {
		this.nomeMaterial_Produto = nomeMaterial_Produto;
	}

	public String getDescricaoMaterial_Produto() {
		return descricaoMaterial_Produto;
	}

	public void setDescricaoMaterial_Produto(String descricaoMaterial_Produto) {
		this.descricaoMaterial_Produto = descricaoMaterial_Produto;
	}


}