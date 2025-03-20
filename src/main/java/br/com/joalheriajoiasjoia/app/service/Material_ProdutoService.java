package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Material_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Material_ProdutoRepository;


@Service
public class Material_ProdutoService {

	@Autowired
	private Material_ProdutoRepository material_ProdutoRepository;
	
	public Material_Produto saveMaterial_Produto( Material_Produto material_Produto) {
		return material_ProdutoRepository.save(material_Produto);
	}
	
	public List<Material_Produto> getAllMateriais_Produtos(){
		return material_ProdutoRepository.findAll();
	}
	
	public Material_Produto getMaterial_ProdutoById (Long id) {
		return material_ProdutoRepository.findById(id).orElse(null);
	}
	
	public void deleteMaterial_Produto(Long id) {
		material_ProdutoRepository.deleteById(id);
	}

}
