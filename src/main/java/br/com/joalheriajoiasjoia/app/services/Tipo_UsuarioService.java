package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;
import br.com.joalheriajoiasjoia.app.repositories.Tipo_UsuarioRepository;

@Service
public class Tipo_UsuarioService {

	@Autowired
	private Tipo_UsuarioRepository tipo_UsuarioRepository;
	
	//Salva o tipo do usuário
	public Tipo_Usuario salvar(Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioRepository.save(tipo_Usuario);
	}
	
	//Busca todos os tipos do usuário
	public List<Tipo_Usuario> listarTodos(){
		return tipo_UsuarioRepository.findAll();
	}
	
	//Busca tipo do usuário por ID
	public Tipo_Usuario buscarPorId(Long id) {
		return tipo_UsuarioRepository.findById(id).orElse(null);
	}
	
	//Deleta tipo do usuário por ID
	public void deletarPorId(Long id) {
		tipo_UsuarioRepository.deleteById(id);
	}
}
