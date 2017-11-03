package br.uninove.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.dao.FilmeDao;
import br.uninove.entidade.Filme;

@WebServlet("/buscartodos.do")
public class BuscarTodos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FilmeDao filmeDao = new FilmeDao();
		List<Filme> listaFilme = filmeDao.buscarTodos();
		
		request.setAttribute("listaFilme", listaFilme);
		request.getRequestDispatcher("buscartodos.jsp").forward(request, response);
		
	}

}