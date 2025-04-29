package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pedido_Produto;
import br.com.joalheriajoiasjoia.app.repositories.Pedido_ProdutoRepository;

@Service
public class Pedido_ProdutoService {

	@Autowired
    private Pedido_ProdutoRepository pedido_ProdutoRepository;

    //Salvar um novo pedido de produto
    public Pedido_Produto salvar(Pedido_Produto pedido_Produto) {
        return pedido_ProdutoRepository.save(pedido_Produto);
    }
   
    //Buscar um pedido de produto por ID
    public Pedido_Produto buscarPorId(Long id) {
        return pedido_ProdutoRepository.findById(id).orElse(null);
    }
   
    //Buscar todos os pedidos de produtos
    public List<Pedido_Produto> listarTodos() {
        return pedido_ProdutoRepository.findAll();
    }
   
    //Deleta um pedido de produto por ID
    public void deletarPorId(Long id) {
        pedido_ProdutoRepository.deleteById(id);
    }
}
