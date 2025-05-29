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

import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.services.TipoProdutoService;


@RestController
@RequestMapping("/tipo_produto")
public class TipoProdutoController {

	@Autowired
	private TipoProdutoService tipoProdutoService;

	//Endpoint para salvar um tipo de produto
	@PostMapping
	public TipoProduto criarTipoProduto(@RequestBody TipoProduto tipoProduto) {
		return tipoProdutoService.salvar(tipoProduto);
	}

	//Endpoint para buscar todos os tipos de produtos
	@GetMapping
	public List<TipoProduto> buscarTodosTiposProdutos() {
		return tipoProdutoService.listarTodos();
	}

	//Endpoint para buscar um tipo de produto por ID
	@GetMapping("/{id}")
	public TipoProduto buscarPorIdTipoProduto(@PathVariable Long id) {
		return tipoProdutoService.buscarPorId(id);
	}

	//Endpoint para editar um tipo de produto
	@PutMapping
	public TipoProduto editarTipoProduto(@RequestBody TipoProduto tipoProduto) {
		return tipoProdutoService.salvar(tipoProduto);
	}

	//Endpoint para deletar um tipo de produto
	@DeleteMapping("/{id}")
	public void deletarTipoProduto(@PathVariable Long id) {
		tipoProdutoService.deletarPorId(id);
	}
}