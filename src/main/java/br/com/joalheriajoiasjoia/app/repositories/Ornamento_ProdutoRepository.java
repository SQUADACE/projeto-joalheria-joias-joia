package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Ornamento_Produto;

@Repository
public interface Ornamento_ProdutoRepository extends JpaRepository<Ornamento_Produto, Long>{

}
