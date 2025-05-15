package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Tipo_Usuario;

@Repository
public interface TipoUsuarioRepository extends JpaRepository<Tipo_Usuario, Long>{

}
