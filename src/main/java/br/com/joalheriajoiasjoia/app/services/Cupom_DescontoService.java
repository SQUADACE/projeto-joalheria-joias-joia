package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Cupom_Desconto;
import br.com.joalheriajoiasjoia.app.repositories.Cupom_DescontoRepository;

@Service
public class Cupom_DescontoService {

	@Autowired
    private Cupom_DescontoRepository cupom_DescontoRepository;

    //Criar um novo cupom de desconto do produto
    public Cupom_Desconto salvar(Cupom_Desconto cupom_Desconto) {
        return cupom_DescontoRepository.save(cupom_Desconto);
    }
   
    //Buscar um cupom de desconto pelo ID
    public Cupom_Desconto buscarPorId(Long id) {
        return cupom_DescontoRepository.findById(id).orElse(null);
    }
   
    //Listar todas os cupons de desconto
    public List<Cupom_Desconto> listarTodas() {
        return cupom_DescontoRepository.findAll();
    }
   
    //Deletar um cupom de desconto por ID
    public void deletarPorId(Long id) {
        cupom_DescontoRepository.deleteById(id);
    }
}
