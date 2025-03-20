package br.com.joalheriajoiasjoia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Material_Produto;
import br.com.joalheriajoiasjoia.app.service.Material_ProdutoService;

@RestController
@RequestMapping("/cadastro_material_produto")
public class Material_ProdutoController {

	@Autowired
	private Material_ProdutoService material_ProdutoService;

	@PostMapping
	public Material_Produto createMaterial_Produto(@RequestBody Material_Produto material_Produto) {
		return material_ProdutoService.saveMaterial_Produto(material_Produto);
	}

	@GetMapping
	public List<Material_Produto> getAllMateriais_Produtos() {
		return material_ProdutoService.getAllMateriais_Produtos();
	}

	@GetMapping("/{id}")
	public Material_Produto getMaterial_Produto(@PathVariable Long id) {
		return material_ProdutoService.getMaterial_ProdutoById(id);
	}

	@PutMapping
	public Material_Produto editMaterial_Produto(@RequestBody Material_Produto material_Produto) {
		return material_ProdutoService.saveMaterial_Produto(material_Produto);
	}

	@DeleteMapping("/{id}")
	public void deleteMaterial_Produto(@PathVariable Long id) {
		material_ProdutoService.deleteMaterial_Produto(id);
	}
}