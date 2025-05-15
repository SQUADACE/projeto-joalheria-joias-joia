package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.repositories.CategoriaProdutoRepository;


@Service
public class CategoriaProdutoService {

	@Autowired
	private CategoriaProdutoRepository categoriaProdutoRepository;
	
	//Salva a categoria do produto
	public CategoriaProduto salvar( CategoriaProduto categoriaProduto) {
		return categoriaProdutoRepository.save(categoriaProduto);
	}
	
	//Busca todas as categorias dos produtos
	public List<CategoriaProduto> buscarTodas(){
		return categoriaProdutoRepository.findAll();
	}
	
	//Busca a categoria do produto por ID
	public CategoriaProduto buscaPorId(Long id) {
		return categoriaProdutoRepository.findById(id).orElse(null);
	}
	
	//Deleta a categoria do produto por ID
	public void deletarPorId(Long id) {
		categoriaProdutoRepository.deleteById(id);
	}
}