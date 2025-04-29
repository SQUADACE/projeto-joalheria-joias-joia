package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentoRepository;

@Service
public class OrnamentoService {

	@Autowired
	private OrnamentoRepository ornamentoRepository;
	
	//Salva o ornamento
	public Ornamento salvar(Ornamento ornamento) {
		return ornamentoRepository.save(ornamento);
	}

	//Lista todos os ornamentos
	public List<Ornamento> listarTodos(){
		return ornamentoRepository.findAll();
	}
	
	//Busca ornamento por ID
	public Ornamento buscarPorId(Long id) {
		return ornamentoRepository.findById(id).orElse(null);
	}
	
	//Deleta ornamento por ID
	public void deletarPorId(Long id) {
		ornamentoRepository.deleteById(id);
	}
}
