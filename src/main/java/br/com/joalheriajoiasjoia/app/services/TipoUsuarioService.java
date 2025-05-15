package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;
import br.com.joalheriajoiasjoia.app.repositories.TipoUsuarioRepository;

@Service
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	//Salva o tipo do usuário
	public Tipo_Usuario salvar(Tipo_Usuario tipoUsuario) {
		return tipoUsuarioRepository.save(tipoUsuario);
	}
	
	//Busca todos os tipos do usuário
	public List<Tipo_Usuario> listarTodos(){
		return tipoUsuarioRepository.findAll();
	}
	
	//Busca tipo do usuário por ID
	public Tipo_Usuario buscarPorId(Long id) {
		return tipoUsuarioRepository.findById(id).orElse(null);
	}
	
	//Deleta tipo do usuário por ID
	public void deletarPorId(Long id) {
		tipoUsuarioRepository.deleteById(id);
	}
}
