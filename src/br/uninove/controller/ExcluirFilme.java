package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.FilmeDao;
import br.uninove.entidade.Filme;

@WebServlet("/excluirfilme.do")
public class ExcluirFilme extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("codigo"));
		
		Filme film = new Filme();
		film.setId(id);
		
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.excluir(film);
		
		response.sendRedirect("http://localhost:8080/EmpresaABC/buscartodos.do");
	}

}
