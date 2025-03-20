package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;
import br.com.joalheriajoiasjoia.app.repositories.Tipo_UsuarioRepository;

@Service
public class Tipo_UsuarioService {

	@Autowired
	private Tipo_UsuarioRepository tipo_UsuarioRepository;
	
	public Tipo_Usuario saveTipo_Usuario(Tipo_Usuario tipo_Usuario) {
		return tipo_UsuarioRepository.save(tipo_Usuario);
	}
	
	public List<Tipo_Usuario> getAllTipos_Usuarios(){
		return tipo_UsuarioRepository.findAll();
	}
	
	public Tipo_Usuario getTipo_UsuarioById (Long id) {
		return tipo_UsuarioRepository.findById(id).orElse(null);
	}
	
	public void deleteTipo_Usuario(Long id) {
		tipo_UsuarioRepository.deleteById(id);
	}
}
