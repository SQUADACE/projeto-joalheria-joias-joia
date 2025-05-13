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

import br.com.joalheriajoiasjoia.app.entities.Cupom_Desconto;
import br.com.joalheriajoiasjoia.app.services.Cupom_DescontoService;

@RestController
@RequestMapping("/cupons_descontos")
public class Cupom_DescontoController {

	@Autowired
    private Cupom_DescontoService cupom_DescontoService;

    //Endpoint para salvar um novo cupom de desconto
    @PostMapping
    public Cupom_Desconto salvarCupom_Desconto(@RequestBody Cupom_Desconto cupom_Desconto) {
        return cupom_DescontoService.salvar(cupom_Desconto);
    }

    //Endpoint para listar todos os cupons de descontos
    @GetMapping
    public List<Cupom_Desconto> listarCupons_Descontos() {
        return cupom_DescontoService.listarTodas();
    }

    //Endpoint para buscar um cupom de desconto por ID
    @GetMapping("/{id}")
    public Cupom_Desconto buscarCupom_DescontoPorId(@PathVariable Long id) {
        return cupom_DescontoService.buscarPorId(id);
    }
    
    //Endpoint para editar um cupom de desconto
  	@PutMapping
  	public Cupom_Desconto editarCupom_Desconto(@RequestBody Cupom_Desconto cupom_Desconto) {
  		return cupom_DescontoService.salvar(cupom_Desconto);
  	}

    //Endpoint para deletar um cupom de desconto por ID
    @DeleteMapping("/{id}")
    public void deletarCupom_Desconto(@PathVariable Long id) {
    	cupom_DescontoService.deletarPorId(id);
    }
}
