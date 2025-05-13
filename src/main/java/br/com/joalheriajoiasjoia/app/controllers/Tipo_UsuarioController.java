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

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;
import br.com.joalheriajoiasjoia.app.services.Tipo_UsuarioService;

@RestController
@RequestMapping("/cadasdro_tipo_usuario")
public class Tipo_UsuarioController {

	@Autowired
	private Tipo_UsuarioService tipo_UsuarioService;

	//Endpoint para salvar um novo tipo de usuário
	@PostMapping
	public Tipo_Usuario criarTipo_Usuario(@RequestBody Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioService.salvar(tipo_Usuario);
	}

	//Endpoint para buscar todos os tipos de usuários
	@GetMapping
	public List<Tipo_Usuario> buscarTodosTipos_Usuarios() {
		return tipo_UsuarioService.listarTodos();
	}

	//Endpoint para buscar um tipo de usuário por ID
	@GetMapping("/{id}")
	public Tipo_Usuario buscarPorIdTipo_Usuario(@PathVariable Long id) {
		return tipo_UsuarioService.buscarPorId(id);
	}

	//Endpoint para editar um tipo de usuário
	@PutMapping
	public Tipo_Usuario editarTipo_Usuario(@RequestBody Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioService.salvar(tipo_Usuario);
	}

	//Endpoint para deletar um tipo de usuário
	@DeleteMapping("/{id}")
	public void deletarTipo_Usuario(@PathVariable Long id) {
		tipo_UsuarioService.deletarPorId(id);
	}
}
