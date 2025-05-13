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

import br.com.joalheriajoiasjoia.app.entities.Categoria_Produto;
import br.com.joalheriajoiasjoia.app.services.Categoria_ProdutoService;

@RestController
@RequestMapping("/cadastro_categoria_produto")
public class Categoria_ProdutoController {

	@Autowired
	private Categoria_ProdutoService categoria_ProdutoService;

	//Endpoint para salvar uma categoria de produto
	@PostMapping
	public Categoria_Produto criarCategoria_Produto(@RequestBody Categoria_Produto categoria_Produto) {
		return categoria_ProdutoService.salvar(categoria_Produto);
	}

	//Endpoint para buscar todas as categorias de produtos
	@GetMapping
	public List<Categoria_Produto> buscarTodosCategorias_Produtos() {
		return categoria_ProdutoService.buscarTodas();
	}

	//Endpoint para buscar uma categoria de produto por ID
	@GetMapping("/{id}")
	public Categoria_Produto buscarCategoria_ProdutoPorId(@PathVariable Long id) {
		return categoria_ProdutoService.buscaPorId(id);
	}

	//Endpoint para editar uma categoria de produto
	@PutMapping
	public Categoria_Produto editarCategoria_Produto(@RequestBody Categoria_Produto categoria_Produto) {
		return categoria_ProdutoService.salvar(categoria_Produto);
	}

	//Endpoint para deletar uma categoria de produto
	@DeleteMapping("/{id}")
	public void deletarCategoria_Produto(@PathVariable Long id) {
		categoria_ProdutoService.deletarPorId(id);
	}
}