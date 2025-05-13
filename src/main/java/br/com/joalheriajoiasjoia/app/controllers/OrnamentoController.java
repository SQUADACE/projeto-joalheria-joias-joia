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

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.services.OrnamentoService;

@RestController
@RequestMapping("/cadastro_ornamento")
public class OrnamentoController {

	@Autowired
	private OrnamentoService ornamentoService;

	//Endpoint para salvar um novo ornamento
	@PostMapping
	public Ornamento criarOrnamento(@RequestBody Ornamento ornamento) {
		return ornamentoService.salvar(ornamento);
	}

	//Endpoint para listar todos os ornamentos
	@GetMapping
	public List<Ornamento> buscarTodosOrnamentos() {
		return ornamentoService.listarTodos();
	}

	//Endpoint para buscar um ornamento por ID
	@GetMapping("/{id}")
	public Ornamento buscarOrnamento(@PathVariable Long id) {
		return ornamentoService.buscarPorId(id);
	}

	//Endpoint para editar um ornamento
	@PutMapping
	public Ornamento editarOrnamento(@RequestBody Ornamento ornamento) {
		return ornamentoService.salvar(ornamento);
	}

	//Endpoint para deletar um ornamento
	@DeleteMapping("/{id}")
	public void deletarOrnamento(@PathVariable Long id) {
		ornamentoService.deletarPorId(id);
	}
}
