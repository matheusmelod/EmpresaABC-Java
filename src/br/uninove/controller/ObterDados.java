package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;

@WebServlet("/obterdados.do")
public class ObterDados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.buscarPorCodigo(codigo);
		usuario.setCodigo(codigo);
		
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("obterdados.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Integer codigo = Integer.parseInt(request.getParameter("txtcodigo"));
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario usuario = new Usuario();
		usuario.setCodigo(codigo);
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.alterar(usuario);
		
		response.sendRedirect("http://localhost:8080/EmpresaABC/buscartodos.do");		
	}

}
