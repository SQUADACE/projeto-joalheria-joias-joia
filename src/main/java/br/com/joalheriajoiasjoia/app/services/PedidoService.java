package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pedido;
import br.com.joalheriajoiasjoia.app.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
    private PedidoRepository pedidoRepository;

    //Salva um novo pedido
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
   
    //Buscar um pedido por ID
    public Pedido buscarPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }
   
    //Buscar todos os pedidos
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }
   
    //Deleta um pedido
    public void deletarPorId(Long id) {
        pedidoRepository.deleteById(id);
    }
}
