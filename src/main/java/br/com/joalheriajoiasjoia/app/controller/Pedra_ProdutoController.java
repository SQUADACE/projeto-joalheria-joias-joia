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

import br.com.joalheriajoiasjoia.app.entities.Pedra_Produto;
import br.com.joalheriajoiasjoia.app.service.Pedra_ProdutoService;

@RestController
@RequestMapping("/cadastro_pedra_produto")
public class Pedra_ProdutoController {

	@Autowired
	private Pedra_ProdutoService pedra_ProdutoService;

	@PostMapping
	public Pedra_Produto createPedra_Produto(@RequestBody Pedra_Produto pedra_Produto) {
		return pedra_ProdutoService.savePedra_Produto(pedra_Produto);
	}

	@GetMapping
	public List<Pedra_Produto> getAllPedras_Produtos() {
		return pedra_ProdutoService.getAllPedras_Produtos();
	}

	@GetMapping("/{id}")
	public Pedra_Produto getPedra_Produto(@PathVariable Long id) {
		return pedra_ProdutoService.getPedra_ProdutoById(id);
	}

	@PutMapping
	public Pedra_Produto editPedra_Produto(@RequestBody Pedra_Produto pedra_Produto) {
		return pedra_ProdutoService.savePedra_Produto(pedra_Produto);
	}

	@DeleteMapping("/{id}")
	public void deletePedra_Produto(@PathVariable Long id) {
		pedra_ProdutoService.deletePedra_Produto(id);
	}
}
