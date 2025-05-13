package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Categoria_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Categoria_ProdutoRepository;


@Service
public class Categoria_ProdutoService {

	@Autowired
	private Categoria_ProdutoRepository categoria_ProdutoRepository;
	
	//Salva a categoria do produto
	public Categoria_Produto salvar( Categoria_Produto categoria_Produto) {
		return categoria_ProdutoRepository.save(categoria_Produto);
	}
	
	//Busca todas as categorias dos produtos
	public List<Categoria_Produto> buscarTodas(){
		return categoria_ProdutoRepository.findAll();
	}
	
	//Busca a categoria do produto por ID
	public Categoria_Produto buscaPorId(Long id) {
		return categoria_ProdutoRepository.findById(id).orElse(null);
	}
	
	//Deleta a categoria do produto por ID
	public void deletarPorId(Long id) {
		categoria_ProdutoRepository.deleteById(id);
	}
}