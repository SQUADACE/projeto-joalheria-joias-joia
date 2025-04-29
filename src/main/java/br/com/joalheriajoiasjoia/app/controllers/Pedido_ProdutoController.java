package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Pedido_Produto;
import br.com.joalheriajoiasjoia.app.services.Pedido_ProdutoService;

@RestController
@RequestMapping("/pedidos_produtos")
public class Pedido_ProdutoController {

	@Autowired
    private Pedido_ProdutoService pedido_ProdutoService;

    //Endpoint para salvar um novo pedido de produto
    @PostMapping
    public Pedido_Produto salvarPedido_Produto(@RequestBody Pedido_Produto pedido_Produto) {
        return pedido_ProdutoService.salvar(pedido_Produto);
    }

    //Endpoint para listar todos os pedidos de produtos
    @GetMapping
    public List<Pedido_Produto> listarPedidos_Produtos() {
        return pedido_ProdutoService.listarTodos();
    }

    //Endpoint para buscar um pedido de produto por ID
    @GetMapping("/{id}")
    public Pedido_Produto buscarPedido_ProdutoPorId(@PathVariable Long id) {
        return pedido_ProdutoService.buscarPorId(id);
    }
    
    //Endpoint para editar um pedido de produto
  	@PutMapping
  	public Pedido_Produto editarPedido_Produto(@RequestBody Pedido_Produto pedido_Produto) {
  		return pedido_ProdutoService.salvar(pedido_Produto);
  	}

    //Endpoint para deletar um pedido de produto por ID
    @DeleteMapping("/{id}")
    public void deletarPedido_Produto(@PathVariable Long id) {
    	pedido_ProdutoService.deletarPorId(id);
    }
}
