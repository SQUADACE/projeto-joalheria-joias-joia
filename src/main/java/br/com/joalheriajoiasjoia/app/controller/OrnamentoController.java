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

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.service.OrnamentoService;

@RestController
@RequestMapping("/cadastro_ornamento")
public class OrnamentoController {

	@Autowired
	private OrnamentoService ornamentoService;

	@PostMapping
	public Ornamento createOrnamento(@RequestBody Ornamento ornamento) {
		return ornamentoService.saveOrnamento(ornamento);
	}

	@GetMapping
	public List<Ornamento> getAllOrnamentos() {
		return ornamentoService.getAllOrnamentos();
	}

	@GetMapping("/{id}")
	public Ornamento getOrnamento(@PathVariable Long id) {
		return ornamentoService.getOrnamentoById(id);
	}

	@PutMapping
	public Ornamento editOrnamento(@RequestBody Ornamento ornamento) {
		return ornamentoService.saveOrnamento(ornamento);
	}

	@DeleteMapping("/{id}")
	public void deleteOrnamento(@PathVariable Long id) {
		ornamentoService.deleteOrnamento(id);
	}
}
