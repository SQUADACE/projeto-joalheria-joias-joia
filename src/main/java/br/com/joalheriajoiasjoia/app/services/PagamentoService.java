package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Pagamento;
import br.com.joalheriajoiasjoia.app.repositories.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
    private PagamentoRepository pagamentoRepository;

    //Salvar um novo pagamento
    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }
   
    // Buscar uma pagamento pelo ID
    public Pagamento buscarPorId(Long id) {
        return pagamentoRepository.findById(id).orElse(null);
    }
   
    //Listar todas os pagamentos
    public List<Pagamento> listarTodas() {
        return pagamentoRepository.findAll();
    }
   
    //Deleta um pagamento por ID
    public void deletarPorId(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
