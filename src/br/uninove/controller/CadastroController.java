package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.UsuarioDao;
import br.uninove.entidade.Usuario;


@WebServlet("/cadastro.do")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nome = request.getParameter("txtnome"); 
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		
		UsuarioDao usuarioDao = new UsuarioDao();
		usuarioDao.cadastrar(usuario);
		
		response.sendRedirect("http://localhost:80809/EmpresaABC/cadastro.html");
		
		
	}

}
