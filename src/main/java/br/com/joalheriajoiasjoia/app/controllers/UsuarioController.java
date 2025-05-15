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

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.services.UsuarioService;

@RestController
@RequestMapping("/cadastro_usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	//Endpoint para salvar um novo usuário
	@PostMapping
	public Usuario criarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);
	}

	//Endpoint para buscar todos os usuários
	@GetMapping
	public List<Usuario> buscarTodosUsuarios() {
		return usuarioService.listarTodos();
	}

	//Endpoint para buscar usuário por ID
	@GetMapping("/{id}")
	public Usuario buscarPorIdUsuario(@PathVariable Long id) {
		return usuarioService.buscarPorId(id);
	}

	//Endpoint para editar um usuário
	@PutMapping("/{id}")
	public Usuario editarUsuario(@PathVariable String id, @RequestBody Usuario usuario) {
	    usuario.setCpf(id);
	    return usuarioService.salvar(usuario);
	}

	//Método de Login
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario loginRequest) {
    	
    	//Chama o serviço para verificar as credenciais
    	Usuario usuario = usuarioService.autenticarUsuario(loginRequest.getNomeUsuario(), loginRequest.getSenha());
    	
    	if(usuario != null) {
    		return usuario;
    	}
    	else {
    		return null;
    	}
    }

    //Endpoint para deletar um usuário
	@DeleteMapping("/{id}")
	public void deletarUsuario(@PathVariable Long id) {
		usuarioService.deletarPorId(id);
	}
	
	@GetMapping("/cpf/{cpf}")
    public Usuario buscarUsuariosPorCpf(@PathVariable String cpf) {
        return usuarioService.buscarUsuarioPorCpf(cpf);
    }

}