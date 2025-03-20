package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Produto;

@Repository
public interface Tipo_ProdutoRepository extends JpaRepository<Tipo_Produto, Long>{

}