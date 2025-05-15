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

import br.com.joalheriajoiasjoia.app.entities.OrnamentoProduto;
import br.com.joalheriajoiasjoia.app.services.OrnamentoProdutoService;

@RestController
@RequestMapping("/ornamentos_produtos")
public class OrnamentoProdutoController {

	@Autowired
    private OrnamentoProdutoService ornamentoProdutoService;

    //Endpoint para salvar um novo ornamento de produto
    @PostMapping
    public OrnamentoProduto salvarOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoService.salvar(ornamentoProduto);
    }

    //Endpoint para listar todos os ornamentos de produtos
    @GetMapping
    public List<OrnamentoProduto> listarOrnamentosProdutos() {
        return ornamentoProdutoService.listarTodas();
    }

    //Endpoint para buscar um ornamento de produto por ID
    @GetMapping("/{id}")
    public OrnamentoProduto buscarOrnamentoProdutoPorId(@PathVariable Long id) {
        return ornamentoProdutoService.buscarPorId(id);
    }
    
    //Endpoint para editar um ornamento de produto
  	@PutMapping
  	public OrnamentoProduto editarOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
  		return ornamentoProdutoService.salvar(ornamentoProduto);
  	}

    //Endpoint para deletar um ornamento de produto por ID
    @DeleteMapping("/{id}")
    public void deletarOrnamentoProduto(@PathVariable Long id) {
    	ornamentoProdutoService.deletarPorId(id);
    }
}
