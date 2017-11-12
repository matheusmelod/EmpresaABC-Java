package br.uninove.testes;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

public class TesteSelecionarUsuario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Usuario usuario = new Usuario();
		UsuarioDao usuarioDao = new UsuarioDao();
		usuario = usuarioDao.buscarPorCodigo(8);
		System.out.println("Codigo: " + usuario.getCodigo());
		System.out.println("Nome " + usuario.getNome());
		System.out.println("Login: " + usuario.getLogin());
		System.out.println("Senha: " + usuario.getSenha());
		
		
	}

}
