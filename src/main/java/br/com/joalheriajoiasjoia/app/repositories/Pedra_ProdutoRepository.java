package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Pedra_Produto;

@Repository
public interface Pedra_ProdutoRepository extends JpaRepository<Pedra_Produto, Long>{

}
