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

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.services.ProdutoService;

@RestController
@RequestMapping("/cadastro_produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	//Endpoint para salvar um produto
	@PostMapping
	public Produto criarProduto(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
	
	//Endpoint para buscar todos os produtos
	@GetMapping
	public List<Produto> buscarTodosProdutos() {
		return produtoService.listarTodos();
	}
	
	//Endpoint para buscar um produto por ID
	@GetMapping("/{id}")
	public Produto buscarProduto(@PathVariable Long id) {
		return produtoService.buscarPorId(id);
	}
	
	//Endpoint para editar um produto
	@PutMapping
	public Produto editarProduto(@RequestBody Produto produto) {
		return produtoService.salvar(produto);
	}
	
	//Endpoint para deletar um produto
	@DeleteMapping("/{id}")
	public void deletarProduto(@PathVariable Long id) {
		produtoService.deletarPorId(id);
	}
}