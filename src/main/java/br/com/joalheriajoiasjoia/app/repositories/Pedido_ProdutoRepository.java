package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Pedido_Produto;

@Repository
public interface Pedido_ProdutoRepository extends JpaRepository<Pedido_Produto, Long>{

}
