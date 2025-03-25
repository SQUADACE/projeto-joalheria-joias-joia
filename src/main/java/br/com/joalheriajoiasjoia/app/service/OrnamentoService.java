package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Ornamento;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentoRepository;

@Service
public class OrnamentoService {

	@Autowired
	private OrnamentoRepository ornamentoRepository;
	
	public Ornamento saveOrnamento(Ornamento ornamento) {
		return ornamentoRepository.save(ornamento);
	}
	
	public List<Ornamento> getAllOrnamentos(){
		return ornamentoRepository.findAll();
	}
	
	public Ornamento getOrnamentoById (Long id) {
		return ornamentoRepository.findById(id).orElse(null);
	}
	
	public void deleteOrnamento(Long id) {
		ornamentoRepository.deleteById(id);
	}
}
