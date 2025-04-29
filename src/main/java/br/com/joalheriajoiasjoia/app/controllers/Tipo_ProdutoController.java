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

import br.com.joalheriajoiasjoia.app.entities.Tipo_Produto;
import br.com.joalheriajoiasjoia.app.services.Tipo_ProdutoService;


@RestController
@RequestMapping("/cadastro_tipo_produto")
public class Tipo_ProdutoController {

	@Autowired
	private Tipo_ProdutoService tipo_ProdutoService;

	//Endpoint para salvar um tipo de produto
	@PostMapping
	public Tipo_Produto criarTipo_Produto(@RequestBody Tipo_Produto tipo_Produto) {
		return tipo_ProdutoService.salvar(tipo_Produto);
	}

	//Endpoint para buscar todos os tipos de produtos
	@GetMapping
	public List<Tipo_Produto> buscarTodosTipos_Produtos() {
		return tipo_ProdutoService.listarTodos();
	}

	//Endpoint para buscar um tipo de produto por ID
	@GetMapping("/{id}")
	public Tipo_Produto buscarPorIdTipo_Produto(@PathVariable Long id) {
		return tipo_ProdutoService.buscarPorId(id);
	}

	//Endpoint para editar um tipo de produto
	@PutMapping
	public Tipo_Produto editarTipo_Produto(@RequestBody Tipo_Produto tipo_Produto) {
		return tipo_ProdutoService.salvar(tipo_Produto);
	}

	//Endpoint para deletar um tipo de produto
	@DeleteMapping("/{id}")
	public void deletarTipo_Produto(@PathVariable Long id) {
		tipo_ProdutoService.deletarPorId(id);
	}
}