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
import br.com.joalheriajoiasjoia.app.services.TipoUsuarioService;

@RestController
@RequestMapping("/cadasdro_tipo_usuario")
public class TipoUsuarioController {

	@Autowired
	private TipoUsuarioService tipoUsuarioService;

	//Endpoint para salvar um novo tipo de usuário
	@PostMapping
	public Tipo_Usuario criarTipoUsuario(@RequestBody Tipo_Usuario tipoUsuario) {
		return tipoUsuarioService.salvar(tipoUsuario);
	}

	//Endpoint para buscar todos os tipos de usuários
	@GetMapping
	public List<Tipo_Usuario> buscarTodosTiposUsuarios() {
		return tipoUsuarioService.listarTodos();
	}

	//Endpoint para buscar um tipo de usuário por ID
	@GetMapping("/{id}")
	public Tipo_Usuario buscarPorIdTipoUsuario(@PathVariable Long id) {
		return tipoUsuarioService.buscarPorId(id);
	}

	//Endpoint para editar um tipo de usuário
	@PutMapping
	public Tipo_Usuario editarTipoUsuario(@RequestBody Tipo_Usuario tipoUsuario) {
		return tipoUsuarioService.salvar(tipoUsuario);
	}

	//Endpoint para deletar um tipo de usuário
	@DeleteMapping("/{id}")
	public void deletarTipoUsuario(@PathVariable Long id) {
		tipoUsuarioService.deletarPorId(id);
	}
}
