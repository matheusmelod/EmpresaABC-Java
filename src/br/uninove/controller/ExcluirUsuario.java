package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

@WebServlet("/excluirusuario.do")
public class ExcluirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		Usuario usuario = new Usuario();
		usuario.setCodigo(codigo);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.excluir(usuario);
		
		response.sendRedirect("http://localhost:8080/EmpresaABC/buscartodos.do");
	}

}
