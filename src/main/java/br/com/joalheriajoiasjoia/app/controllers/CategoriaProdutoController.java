package br.com.joalheriajoiasjoia.app.controllers;

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

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.services.CategoriaProdutoService;

@RestController
@RequestMapping("/categoria_produto")
public class CategoriaProdutoController {

	@Autowired
	private CategoriaProdutoService categoriaProdutoService;

	//Endpoint para salvar uma categoria de produto
	@PostMapping
	public CategoriaProduto criarCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
		return categoriaProdutoService.salvar(categoriaProduto);
	}

	//Endpoint para buscar todas as categorias de produtos
	@GetMapping
	public List<CategoriaProduto> buscarTodosCategoriasProdutos() {
		return categoriaProdutoService.buscarTodas();
	}

	//Endpoint para buscar uma categoria de produto por ID
	@GetMapping("/{id}")
	public CategoriaProduto buscarCategoriaProdutoPorId(@PathVariable Long id) {
		return categoriaProdutoService.buscaPorId(id);
	}

	//Endpoint para editar uma categoria de produto
	@PutMapping
	public CategoriaProduto editarCategoriaProduto(@RequestBody CategoriaProduto categoriaProduto) {
		return categoriaProdutoService.salvar(categoriaProduto);
	}

	//Endpoint para deletar uma categoria de produto
	@DeleteMapping("/{id}")
	public void deletarCategoriaProduto(@PathVariable Long id) {
		categoriaProdutoService.deletarPorId(id);
	}
}