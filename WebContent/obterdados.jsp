<%@page import="br.uninove.entidade.Usuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="obterdados.do">
	
		Código: <input type="text" name="txtcodigo" value="${usuario.codigo}" readonly><br><br>
		Nome: <input type="text" name="txtnome" value="${usuario.nome}"><br><br>
		Login: <input type="text" name="txtlogin" value="${usuario.login}"><br><br>
		Senha: <input type="text" name="txtsenha" value="${usuario.senha}"><br><br>
		
		<input type="submit" value="Alterar Cadastro">
		
	</form>

</body>
</html>