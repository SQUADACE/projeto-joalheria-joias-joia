package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.TipoUsuario;
import br.com.joalheriajoiasjoia.app.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	//Salva o tipo do usuário
	public TipoUsuario salvar(TipoUsuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}
	
	//Busca todos os tipos do usuário
	public List<TipoUsuario> listarTodos(){
		return tipoUsuarioRepository.findAll();
	}
	
	//Busca tipo do usuário por ID
	public TipoUsuario buscarPorId(Long id) {
		return tipoUsuarioRepository.findById(id).orElse(null);
	}
	
	//Deleta tipo do usuário por ID
	public void deletarPorId(Long id) {
		tipoUsuarioRepository.deleteById(id);
	}
}
