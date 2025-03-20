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

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;
import br.com.joalheriajoiasjoia.app.service.Tipo_UsuarioService;

@RestController
@RequestMapping("/cadasdro_tipo_usuario")
public class Tipo_UsuarioController {

	@Autowired
	private Tipo_UsuarioService tipo_UsuarioService;

	@PostMapping
	public Tipo_Usuario createTipo_Usuario(@RequestBody Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioService.saveTipo_Usuario(tipo_Usuario);
	}

	@GetMapping
	public List<Tipo_Usuario> getAllTipos_Usuarios() {
		return tipo_UsuarioService.getAllTipos_Usuarios();
	}

	@GetMapping("/{id}")
	public Tipo_Usuario getTipo_Usuario(@PathVariable Long id) {
		return tipo_UsuarioService.getTipo_UsuarioById(id);
	}

	@PutMapping
	public Tipo_Usuario editTipo_Usuario(@RequestBody Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioService.saveTipo_Usuario(tipo_Usuario);
	}

	@DeleteMapping("/{id}")
	public void deleteTipo_Usuario(@PathVariable Long id) {
		tipo_UsuarioService.deleteTipo_Usuario(id);
	}
}
