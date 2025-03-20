package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pedra_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Pedra_ProdutoRepository;

@Service
public class Pedra_ProdutoService {

	@Autowired
	private Pedra_ProdutoRepository pedra_ProdutoRepository;
	
	public Pedra_Produto savePedra_Produto(Pedra_Produto Pedra_Produto) {
		return pedra_ProdutoRepository.save(Pedra_Produto);
	}
	
	public List<Pedra_Produto> getAllPedras_Produtos(){
		return pedra_ProdutoRepository.findAll();
	}
	
	public Pedra_Produto getPedra_ProdutoById (Long id) {
		return pedra_ProdutoRepository.findById(id).orElse(null);
	}
	
	public void deletePedra_Produto(Long id) {
		pedra_ProdutoRepository.deleteById(id);
	}
}
