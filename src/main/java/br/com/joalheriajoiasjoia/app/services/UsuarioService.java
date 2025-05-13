package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	//Salva o usuário
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	//Busca todos os usuários
	public List<Usuario> listarTodos(){
		return usuarioRepository.findAll();
	}
	
	//Busca o usuário por ID
	public Usuario buscarPorId(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	//Deleta o usuário por ID
	public void deletarPorId(Long id) {
		usuarioRepository.deleteById(id);
	}

	//Busca o usuário por CPF
	public Usuario buscarUsuarioPorCpf(String cpf) {
        return usuarioRepository.findByCpf(cpf);
    }
	
	//Verificar usuário e senha
    public Usuario autenticarUsuario(String nome_Usuario, String senha) {
       
        //Verifica existencia do usuário
        Usuario usuario = usuarioRepository.findByNomeUsuario(nome_Usuario);
       
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            return null;
        }
    }

}