package br.uninove.testes;

import java.util.List;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

public class TesteBuscarTodos {

	public static void main(String[] args) {
		

		UsuarioDao usuarioDao = new UsuarioDao();
		List<Usuario> listagemUsuarios = usuarioDao.buscarTodos();
		
		for(Usuario u:listagemUsuarios){
			System.out.println("Codigo: " + u.getNome());
			System.out.println("Nome: " + u.getNome());
			System.out.println("Login: " + u.getLogin());
			System.out.println("Senha: " + u.getSenha());
			
			
		}
		
		
	}

}
