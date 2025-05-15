package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.repositories.TipoProdutoRepository;

@Service
public class TipoProdutoService {

	@Autowired
	private TipoProdutoRepository tipoProdutoRepository;
	
	//Salva o tipo do produto
	public TipoProduto salvar( TipoProduto tipoProduto) {
		return tipoProdutoRepository.save(tipoProduto);
	}
	
	//Busca todos os tipos do produto
	public List<TipoProduto> listarTodos(){
		return tipoProdutoRepository.findAll();
	}
	
	//Busca tipo do produto por ID
	public TipoProduto buscarPorId(Long id) {
		return tipoProdutoRepository.findById(id).orElse(null);
	}
	
	//Deleta tipo do produto por ID
	public void deletarPorId(Long id) {
		tipoProdutoRepository.deleteById(id);
	}

}