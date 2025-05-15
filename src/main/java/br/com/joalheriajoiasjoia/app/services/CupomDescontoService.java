package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CupomDesconto;
import br.com.joalheriajoiasjoia.app.repositories.CupomDescontoRepository;

@Service
public class CupomDescontoService {

	@Autowired
    private CupomDescontoRepository cupomDescontoRepository;

    //Criar um novo cupom de desconto do produto
    public CupomDesconto salvar(CupomDesconto cupomDesconto) {
        return cupomDescontoRepository.save(cupomDesconto);
    }
   
    //Buscar um cupom de desconto pelo ID
    public CupomDesconto buscarPorId(Long id) {
        return cupomDescontoRepository.findById(id).orElse(null);
    }
   
    //Listar todas os cupons de desconto
    public List<CupomDesconto> listarTodas() {
        return cupomDescontoRepository.findAll();
    }
   
    //Deletar um cupom de desconto por ID
    public void deletarPorId(Long id) {
        cupomDescontoRepository.deleteById(id);
    }
}
