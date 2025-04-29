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

import br.com.joalheriajoiasjoia.app.entities.Ornamento_Produto;
import br.com.joalheriajoiasjoia.app.services.Ornamento_ProdutoService;

@RestController
@RequestMapping("/ornamentos_produtos")
public class Ornamento_ProdutoController {

	@Autowired
    private Ornamento_ProdutoService ornamento_ProdutoService;

    //Endpoint para salvar um novo ornamento de produto
    @PostMapping
    public Ornamento_Produto salvarOrnamento_Produto(@RequestBody Ornamento_Produto ornamento_Produto) {
        return ornamento_ProdutoService.salvar(ornamento_Produto);
    }

    //Endpoint para listar todos os ornamentos de produtos
    @GetMapping
    public List<Ornamento_Produto> listarOrnamentos_Produtos() {
        return ornamento_ProdutoService.listarTodas();
    }

    //Endpoint para buscar um ornamento de produto por ID
    @GetMapping("/{id}")
    public Ornamento_Produto buscarOrnamento_ProdutoPorId(@PathVariable Long id) {
        return ornamento_ProdutoService.buscarPorId(id);
    }
    
    //Endpoint para editar um ornamento de produto
  	@PutMapping
  	public Ornamento_Produto editarOrnamento_Produto(@RequestBody Ornamento_Produto ornamento_Produto) {
  		return ornamento_ProdutoService.salvar(ornamento_Produto);
  	}

    //Endpoint para deletar um ornamento de produto por ID
    @DeleteMapping("/{id}")
    public void deletarOrnamento_Produto(@PathVariable Long id) {
    	ornamento_ProdutoService.deletarPorId(id);
    }
}
