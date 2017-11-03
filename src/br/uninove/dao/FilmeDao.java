package br.uninove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.uninove.entidade.Filme;
import br.uninove.jdbc.Conexao;

public class FilmeDao {

	public void cadastrar(Filme film){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "INSERT INTO FILME(filme,genero,classificacao) VALUES (?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, film.getFilme());
			preparador.setString(2, film.getGenero());
			preparador.setString(3, film.getClassificacao());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Filme cadastrado com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterar(Filme film) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "UPDATE FILME SET filme=?, genero=?, classificacao=? WHERE id=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, film.getFilme());
			preparador.setString(2, film.getGenero());
			preparador.setString(3, film.getClassificacao());
			preparador.setInt(4, film.getId());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Filme alterado com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void excluir(Filme film) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "DELETE FROM FILME WHERE id=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, film.getId());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Filme excluido com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Filme buscarPorCodigo(Integer codigo){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "SELECT * FROM FILME WHERE id=?";
		
		Filme film = null;
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			ResultSet resultado = preparador.executeQuery();
			if(resultado.next()){
				film = new Filme();
				film.setFilme(resultado.getString("filme"));
				film.setGenero(resultado.getString("genero"));
				film.setClassificacao(resultado.getString("classificacao"));
			}
			
			preparador.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return film;
	}
	
	
	public List<Filme> buscarTodos(){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "SELECT * FROM FILME";
		
		ArrayList<Filme> listaFilme = new ArrayList<Filme>();
		
		try{
		
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while (resultado.next()){
				
				Filme film = new Filme();
				film.setId(resultado.getInt("id"));
				film.setFilme(resultado.getString("filme"));
				film.setGenero(resultado.getString("genero"));
				film.setClassificacao(resultado.getString("classificacao"));
				
				listaFilme.add(film);
				
				
				
			}
			
		
		
		}catch (SQLException e){
			e.printStackTrace();
			
		}
		
		
		return listaFilme;
		
	 }
	
}
