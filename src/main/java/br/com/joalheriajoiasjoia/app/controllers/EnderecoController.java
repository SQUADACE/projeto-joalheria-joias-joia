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

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.services.EnderecoService;

@RestController
@RequestMapping("/cadastro_endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	//Endpoint para salvar um novo endereço
	@PostMapping
	public Endereco criarEndereco(@RequestBody Endereco endereco) {
		return enderecoService.salvar(endereco);
	}
	
	//Endpoint para buscar todos os endereços
	@GetMapping
	public List<Endereco> buscarTodosEndereco() {
		return enderecoService.listarTodos();
	}
	
	//Endpoint para buscar um endereço por ID
	@GetMapping("/{id}")
	public Endereco buscarEndereco(@PathVariable Long id) {
		return enderecoService.buscarPorId(id);
	}
	
	//Endpoint para editar um endereço
	@PutMapping
	public Endereco editarEndereco(@RequestBody Endereco endereco) {
		return enderecoService.salvar(endereco);
	}
	
	//Endpoint para deletar um endereço
	@DeleteMapping("/{id}")
	public void deletarEndereco(@PathVariable Long id) {
		enderecoService.deletarPorId(id);
	}
}