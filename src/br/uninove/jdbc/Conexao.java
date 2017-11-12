package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.DriverManager; // jdbc
import java.sql.SQLException;

public class Conexao {

	public static Connection receberConexao() { // classe já existente no java no pacote "sql" na JRE Java Library
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancodedadosusuario", "root", "");
			System.out.println("Conectado com sucesso!!!");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
