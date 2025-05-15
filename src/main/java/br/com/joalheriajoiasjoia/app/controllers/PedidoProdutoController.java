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

import br.com.joalheriajoiasjoia.app.entities.PedidoProduto;
import br.com.joalheriajoiasjoia.app.services.PedidoProdutoService;

@RestController
@RequestMapping("/pedidos_produtos")
public class PedidoProdutoController {

	@Autowired
    private PedidoProdutoService pedidoProdutoService;

    //Endpoint para salvar um novo pedido de produto
    @PostMapping
    public PedidoProduto salvarPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
        return pedidoProdutoService.salvar(pedidoProduto);
    }

    //Endpoint para listar todos os pedidos de produtos
    @GetMapping
    public List<PedidoProduto> listarPedidosProdutos() {
        return pedidoProdutoService.listarTodos();
    }

    //Endpoint para buscar um pedido de produto por ID
    @GetMapping("/{id}")
    public PedidoProduto buscarPedidoProdutoPorId(@PathVariable Long id) {
        return pedidoProdutoService.buscarPorId(id);
    }
    
    //Endpoint para editar um pedido de produto
  	@PutMapping
  	public PedidoProduto editarPedidoProduto(@RequestBody PedidoProduto pedidoProduto) {
  		return pedidoProdutoService.salvar(pedidoProduto);
  	}

    //Endpoint para deletar um pedido de produto por ID
    @DeleteMapping("/{id}")
    public void deletarPedidoProduto(@PathVariable Long id) {
    	pedidoProdutoService.deletarPorId(id);
    }
}
