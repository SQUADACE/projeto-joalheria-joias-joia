package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Ornamento_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Ornamento_ProdutoRepository;

@Service
public class Ornamento_ProdutoService {

	@Autowired
    private Ornamento_ProdutoRepository ornamento_ProdutoRepository;

    //Criar uma novo ornamento de produto
    public Ornamento_Produto salvar(Ornamento_Produto ornamento_Produto) {
        return ornamento_ProdutoRepository.save(ornamento_Produto);
    }
   
    //Buscar um ornamento de produto pelo ID
    public Ornamento_Produto buscarPorId(Long id) {
        return ornamento_ProdutoRepository.findById(id).orElse(null);
    }
   
    //Listar todas os ornamentos de produtos
    public List<Ornamento_Produto> listarTodas() {
        return ornamento_ProdutoRepository.findAll();
    }
   
    //Deletar um ornamento do produto por ID
    public void deletarPorId(Long id) {
        ornamento_ProdutoRepository.deleteById(id);
    }
}
