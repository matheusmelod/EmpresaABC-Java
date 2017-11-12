package br.uninove.testes;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

public class TesteAlterarUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("Maria Ribeiro");
		usuario.setLogin("mribeiro");
		usuario.setSenha("maria123");
		usuario.setCodigo(1);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		
		usuarioDao.alterar(usuario);

	}

}
