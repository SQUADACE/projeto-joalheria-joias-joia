package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Material_Produto;

@Repository
public interface Material_ProdutoRepository extends JpaRepository<Material_Produto, Long>{

}