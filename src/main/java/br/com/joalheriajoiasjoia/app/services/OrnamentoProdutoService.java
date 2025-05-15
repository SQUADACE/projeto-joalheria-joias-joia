package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.OrnamentoProduto;
import br.com.joalheriajoiasjoia.app.repositories.OrnamentoProdutoRepository;

@Service
public class OrnamentoProdutoService {

	@Autowired
    private OrnamentoProdutoRepository ornamentoProdutoRepository;

    //Criar uma novo ornamento de produto
    public OrnamentoProduto salvar(OrnamentoProduto ornamentoProduto) {
        return ornamentoProdutoRepository.save(ornamentoProduto);
    }
   
    //Buscar um ornamento de produto pelo ID
    public OrnamentoProduto buscarPorId(Long id) {
        return ornamentoProdutoRepository.findById(id).orElse(null);
    }
   
    //Listar todas os ornamentos de produtos
    public List<OrnamentoProduto> listarTodas() {
        return ornamentoProdutoRepository.findAll();
    }
   
    //Deletar um ornamento do produto por ID
    public void deletarPorId(Long id) {
        ornamentoProdutoRepository.deleteById(id);
    }
}
