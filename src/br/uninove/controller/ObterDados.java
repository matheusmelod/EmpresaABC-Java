package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.FilmeDao;
import br.uninove.entidade.Filme;

@WebServlet("/obterdados.do")
public class ObterDados extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("id"));
		
		FilmeDao usuarioDao = new FilmeDao();
		Filme filme = usuarioDao.buscarPorCodigo(id);
		filme.setId(id);
		
		request.setAttribute("filme", filme);
		request.getRequestDispatcher("obterdados.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Integer id = Integer.parseInt(request.getParameter("txtid"));
		String filme = request.getParameter("txtfilme");
		String genero = request.getParameter("txtgenero");
		String classificacao = request.getParameter("txtclassificacao");
		
		Filme film = new Filme();
		film.setId(id);
		film.setFilme(filme);
		film.setGenero(genero);
		film.setClassificacao(classificacao);
		
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.alterar(film);
		
		response.sendRedirect("http://localhost:8080/EmpresaABC/buscartodos.do");		
	}

}
