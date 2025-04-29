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

import br.com.joalheriajoiasjoia.app.entities.Pagamento;
import br.com.joalheriajoiasjoia.app.services.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

	@Autowired
    private PagamentoService pagamentoService;

    //Endpoint para salvar um novo pagamento
    @PostMapping
    public Pagamento salvarPagamento(@RequestBody Pagamento pagamento) {
        return pagamentoService.salvar(pagamento);
    }

    //Endpoint para listar todos os pagamentos
    @GetMapping
    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarTodas();
    }

    //Endpoint para buscar um pagamento por ID
    @GetMapping("/{id}")
    public Pagamento buscarPagamentoPorId(@PathVariable Long id) {
        return pagamentoService.buscarPorId(id);
    }
    
    //Endpoint para editar um pagamento
  	@PutMapping
  	public Pagamento editarPagamento(@RequestBody Pagamento pagamento) {
  		return pagamentoService.salvar(pagamento);
  	}

    //Endpoint para deletar um pagamento por ID
    @DeleteMapping("/{id}")
    public void deletarPagamento(@PathVariable Long id) {
    	pagamentoService.deletarPorId(id);
    }
}
