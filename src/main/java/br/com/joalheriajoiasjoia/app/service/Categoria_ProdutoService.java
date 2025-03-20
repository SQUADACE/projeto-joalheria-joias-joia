package br.com.joalheriajoiasjoia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Categoria_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Categoria_ProdutoRepository;


@Service
public class Categoria_ProdutoService {

	@Autowired
	private Categoria_ProdutoRepository categoria_ProdutoRepository;
	
	public Categoria_Produto saveCategoria_Produto( Categoria_Produto categoria_Produto) {
		return categoria_ProdutoRepository.save(categoria_Produto);
	}
	
	public List<Categoria_Produto> getAllCategorias_Produtos(){
		return categoria_ProdutoRepository.findAll();
	}
	
	public Categoria_Produto getCategoria_ProdutoById (Long id) {
		return categoria_ProdutoRepository.findById(id).orElse(null);
	}
	
	public void deleteCategoria_Produto(Long id) {
		categoria_ProdutoRepository.deleteById(id);
	}
}