package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	//Busca por CPF
	Usuario findByCpf(String cpf);

	//Busca por Nome do Usuário
	Usuario findByNomeUsuario(String nomeUsuario);
}