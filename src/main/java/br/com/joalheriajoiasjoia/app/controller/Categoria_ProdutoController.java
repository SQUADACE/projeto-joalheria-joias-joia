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

import br.com.joalheriajoiasjoia.app.entities.Categoria_Produto;
import br.com.joalheriajoiasjoia.app.service.Categoria_ProdutoService;

@RestController
@RequestMapping("/cadastro_categoria_produto")
public class Categoria_ProdutoController {

	@Autowired
	private Categoria_ProdutoService categoria_ProdutoService;

	@PostMapping
	public Categoria_Produto createCategoria_Produto(@RequestBody Categoria_Produto categoria_Produto) {
		return categoria_ProdutoService.saveCategoria_Produto(categoria_Produto);
	}

	@GetMapping
	public List<Categoria_Produto> getAllCategorias_Produtos() {
		return categoria_ProdutoService.getAllCategorias_Produtos();
	}

	@GetMapping("/{id}")
	public Categoria_Produto getCategoria_Produto(@PathVariable Long id) {
		return categoria_ProdutoService.getCategoria_ProdutoById(id);
	}

	@PutMapping
	public Categoria_Produto editCategoria_Produto(@RequestBody Categoria_Produto categoria_Produto) {
		return categoria_ProdutoService.saveCategoria_Produto(categoria_Produto);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoria_Produto(@PathVariable Long id) {
		categoria_ProdutoService.deleteCategoria_Produto(id);
	}
}