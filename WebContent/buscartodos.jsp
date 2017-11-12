<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="br.uninove.entidade.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Mostrar todos usuarios</h1>
	
	
	<table border=1 cellspacing="0" width="70%">
		<tr bgcolor="black"  style="color:pink">
			<th>Código</th><th>Nome</th><th>Login</th><th>Senha</th><th colspan="2">Ação</th>
		</tr>
	
			<c:forEach items="${listaUsuarios}"  var="usu" >
	
		<tr>
			<td>${usu['codigo']}</td>
			<td>${usu['nome']}</td>
			<td>${usu['login']}</td>
			<td>${usu['senha']}</td>
			
			<td><a href="excluirusuario.do?codigo=${usu['codigo']}">Excluir</a></td>
			<td><a href="obterdados.do?codigo=${usu['codigo']}">Alterar</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>