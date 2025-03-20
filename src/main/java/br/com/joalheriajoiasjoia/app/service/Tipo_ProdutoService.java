package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Tipo_ProdutoRepository;

@Service
public class Tipo_ProdutoService {

	@Autowired
	private Tipo_ProdutoRepository tipo_ProdutoRepository;
	
	public Tipo_Produto saveTipo_Produto( Tipo_Produto tipo_Produto) {
		return tipo_ProdutoRepository.save(tipo_Produto);
	}
	
	public List<Tipo_Produto> getAllTipos_Produtos(){
		return tipo_ProdutoRepository.findAll();
	}
	
	public Tipo_Produto getTipo_ProdutoById (Long id) {
		return tipo_ProdutoRepository.findById(id).orElse(null);
	}
	
	public void deleteTipo_Produto(Long id) {
		tipo_ProdutoRepository.deleteById(id);
	}

}