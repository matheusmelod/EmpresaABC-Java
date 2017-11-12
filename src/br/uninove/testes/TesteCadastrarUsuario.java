package br.uninove.testes;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

public class TesteCadastrarUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("irineu");
		usuario.setLogin("vcnaosabe");
		usuario.setSenha("ze123");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		usuarioDao.cadastrar(usuario);

	}

}
