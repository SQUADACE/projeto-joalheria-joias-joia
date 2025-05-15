package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.PedidoProduto;
import br.com.joalheriajoiasjoia.app.repositories.PedidoProdutoRepository;

@Service
public class PedidoProdutoService {

	@Autowired
    private PedidoProdutoRepository pedidoProdutoRepository;

    //Salvar um novo pedido de produto
    public PedidoProduto salvar(PedidoProduto pedidoProduto) {
        return pedidoProdutoRepository.save(pedidoProduto);
    }
   
    //Buscar um pedido de produto por ID
    public PedidoProduto buscarPorId(Long id) {
        return pedidoProdutoRepository.findById(id).orElse(null);
    }
   
    //Buscar todos os pedidos de produtos
    public List<PedidoProduto> listarTodos() {
        return pedidoProdutoRepository.findAll();
    }
   
    //Deleta um pedido de produto por ID
    public void deletarPorId(Long id) {
        pedidoProdutoRepository.deleteById(id);
    }
}
