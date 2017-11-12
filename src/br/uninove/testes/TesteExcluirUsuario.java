package br.uninove.testes;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

	public class TesteExcluirUsuario {

	
		public static void main(String[] args) {
			
			Usuario usuario = new Usuario();
			
			usuario.setCodigo(6);
			
			UsuarioDao usuarioDao = new UsuarioDao();
			
			usuarioDao.excluir(usuario);

		}

	}

