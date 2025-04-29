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

import br.com.joalheriajoiasjoia.app.entities.Pedido;
import br.com.joalheriajoiasjoia.app.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	//Endpoint para salvar um novo pedido
	@PostMapping
	public Pedido criarPedido(@RequestBody Pedido pedido) {
		return pedidoService.salvar(pedido);
	}
	
	//Endpoint para buscar todos os pedidos
	@GetMapping
	public List<Pedido> buscarTodosPedidos() {
		return pedidoService.listarTodos();
	}
	
	//Endpoint para buscar um pedido por ID
	@GetMapping("/{id}")
	public Pedido buscarPedido(@PathVariable Long id) {
		return pedidoService.buscarPorId(id);
	}
	
	//Endpoint para editar um pedido
	@PutMapping
	public Pedido editarPedido(@RequestBody Pedido pedido) {
		return pedidoService.salvar(pedido);
	}
	
	//Endpoint para deletar um pedido
	@DeleteMapping("/{id}")
	public void deletarPedido(@PathVariable Long id) {
		pedidoService.deletarPorId(id);
	}
}
