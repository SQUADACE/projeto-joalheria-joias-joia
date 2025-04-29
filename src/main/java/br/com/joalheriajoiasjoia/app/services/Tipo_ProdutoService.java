package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Tipo_ProdutoRepository;

@Service
public class Tipo_ProdutoService {

	@Autowired
	private Tipo_ProdutoRepository tipo_ProdutoRepository;
	
	//Salva o tipo do produto
	public Tipo_Produto salvar( Tipo_Produto tipo_Produto) {
		return tipo_ProdutoRepository.save(tipo_Produto);
	}
	
	//Busca todos os tipos do produto
	public List<Tipo_Produto> listarTodos(){
		return tipo_ProdutoRepository.findAll();
	}
	
	//Busca tipo do produto por ID
	public Tipo_Produto buscarPorId(Long id) {
		return tipo_ProdutoRepository.findById(id).orElse(null);
	}
	
	//Deleta tipo do produto por ID
	public void deletarPorId(Long id) {
		tipo_ProdutoRepository.deleteById(id);
	}

}