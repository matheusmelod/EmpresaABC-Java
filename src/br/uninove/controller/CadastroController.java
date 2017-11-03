package br.uninove.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.FilmeDao;
import br.uninove.entidade.Filme;


@WebServlet("/cadastro.do")
public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String filme = request.getParameter("txtfilme"); 
		String genero = request.getParameter("txtgenero");
		String classificacao = request.getParameter("txtclassificacao");
		
		Filme film = new Filme();
		film.setFilme(filme);
		film.setGenero(genero);
		film.setClassificacao(classificacao);
		
		FilmeDao filmeDao = new FilmeDao();
		filmeDao.cadastrar(film);
		
		response.sendRedirect("http://localhost:8080/EmpresaABC/buscartodos.do");
		
		
	}

}
