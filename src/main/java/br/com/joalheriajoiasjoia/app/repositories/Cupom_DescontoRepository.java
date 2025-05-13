package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Cupom_Desconto;

@Repository
public interface Cupom_DescontoRepository extends JpaRepository<Cupom_Desconto, Long>{

}
