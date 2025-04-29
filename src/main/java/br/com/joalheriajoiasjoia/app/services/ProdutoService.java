package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	//Salva produto
	public Produto salvar( Produto produto) {
		return produtoRepository.save(produto);
	}
	
	//Busca todos os produtos
	public List<Produto> listarTodos(){
		return produtoRepository.findAll();
	}
	
	//Busca produto por ID
	public Produto buscarPorId(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
	//Deleta produto por ID
	public void deletarPorId(Long id) {
		produtoRepository.deleteById(id);
	}

}