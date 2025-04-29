package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Endereco;
import br.com.joalheriajoiasjoia.app.repositories.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	//Salva o endereço
	public Endereco salvar(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	//Busca todos os endereços
	public List<Endereco> listarTodos() {
		return enderecoRepository.findAll();
	}
	
	//Busca o endereço por ID
	public Endereco buscarPorId(Long id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	
	//Deleta o endereço por ID
	public void deletarPorId(Long id) {
		enderecoRepository.deleteById(id);
	}
}