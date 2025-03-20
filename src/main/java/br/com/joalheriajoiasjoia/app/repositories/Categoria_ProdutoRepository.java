package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Categoria_Produto;

@Repository
public interface Categoria_ProdutoRepository extends JpaRepository<Categoria_Produto, Long>{

}