package br.uninove.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.uninove.entidade.Usuario;
import br.uninove.jdbc.Conexao;


public class UsuarioDao {

	public void cadastrar(Usuario usu){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "INSERT INTO Usuario(nome,login,senha) VALUES (?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Usuário cadastrado com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterar(Usuario usu) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "UPDATE usuario SET nome=?, login=?, senha=? WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.setInt(4, usu.getCodigo());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Usuário alterado com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void excluir(Usuario usu) {
		
		Connection con = Conexao.receberConexao();
		
		String sql = "DELETE FROM usuario WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);

			preparador.setInt(1, usu.getCodigo());
			
			preparador.execute();
			
			preparador.close();
			
			System.out.println("Usuário excluido com sucesso!!!");
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Usuario buscarPorCodigo(Integer codigo){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "SELECT * FROM usuario WHERE codigo=?";
		
		Usuario usuario = null;
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, codigo);
			ResultSet resultado = preparador.executeQuery();
			if(resultado.next()){
				usuario = new Usuario();
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
			}
			
			preparador.close();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return usuario;
	}
	
	
	public List<Usuario> buscarTodos(){
		
		Connection con = Conexao.receberConexao();
		
		String sql = "SELECT * FROM USUARIO";
		
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		
		try{
		
			PreparedStatement preparador = con.prepareStatement(sql);
			
			ResultSet resultado = preparador.executeQuery();
			
			while (resultado.next()){
				
				Usuario usuario = new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				
				listaUsuario.add(usuario);
				
				
				
			}
			
		
		
		}catch (SQLException e){
			e.printStackTrace();
			
		}
		
		
		return listaUsuario;
		
	 }
	
	

	
	
	
	
}
