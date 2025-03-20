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

import br.com.joalheriajoiasjoia.app.entities.Tipo_Produto;
import br.com.joalheriajoiasjoia.app.service.Tipo_ProdutoService;


@RestController
@RequestMapping("/cadastro_tipo_produto")
public class Tipo_ProdutoController {

	@Autowired
	private Tipo_ProdutoService tipo_ProdutoService;

	@PostMapping
	public Tipo_Produto createTipo_Produto(@RequestBody Tipo_Produto tipo_Produto) {
		return tipo_ProdutoService.saveTipo_Produto(tipo_Produto);
	}

	@GetMapping
	public List<Tipo_Produto> getAllTipos_Produtos() {
		return tipo_ProdutoService.getAllTipos_Produtos();
	}

	@GetMapping("/{id}")
	public Tipo_Produto getTipo_Produto(@PathVariable Long id) {
		return tipo_ProdutoService.getTipo_ProdutoById(id);
	}

	@PutMapping
	public Tipo_Produto editTipo_Produto(@RequestBody Tipo_Produto tipo_Produto) {
		return tipo_ProdutoService.saveTipo_Produto(tipo_Produto);
	}

	@DeleteMapping("/{id}")
	public void deleteTipo_Produto(@PathVariable Long id) {
		tipo_ProdutoService.deleteTipo_Produto(id);
	}
}