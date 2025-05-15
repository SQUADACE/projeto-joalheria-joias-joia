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

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;
import br.com.joalheriajoiasjoia.app.services.CupomDescontoService;

@RestController
@RequestMapping("/cupons_descontos")
public class CupomDescontoController {

	@Autowired
    private CupomDescontoService cupomDescontoService;

    //Endpoint para salvar um novo cupom de desconto
    @PostMapping
    public CupomDesconto salvarCupomDesconto(@RequestBody CupomDesconto cupomDesconto) {
        return cupomDescontoService.salvar(cupomDesconto);
    }

    //Endpoint para listar todos os cupons de descontos
    @GetMapping
    public List<CupomDesconto> listarCuponsDescontos() {
        return cupomDescontoService.listarTodas();
    }

    //Endpoint para buscar um cupom de desconto por ID
    @GetMapping("/{id}")
    public CupomDesconto buscarCupomDescontoPorId(@PathVariable Long id) {
        return cupomDescontoService.buscarPorId(id);
    }
    
    //Endpoint para editar um cupom de desconto
  	@PutMapping
  	public CupomDesconto editarCupomDesconto(@RequestBody CupomDesconto cupomDesconto) {
  		return cupomDescontoService.salvar(cupomDesconto);
  	}

    //Endpoint para deletar um cupom de desconto por ID
    @DeleteMapping("/{id}")
    public void deletarCupomDesconto(@PathVariable Long id) {
    	cupomDescontoService.deletarPorId(id);
    }
}
