<%@page import="br.uninove.entidade.Filme"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Filme film = (Filme)request.getAttribute("filme");
%>
<h1>Editar de Filme</h1> 
	<form method="post" action="obterdados.do">
	
		Id: <input style="margin-left: 75px;" type="text" name="txtid" value="<%=film.getId() %>" readonly><br><br>
		Filme: <input style="margin-left: 50px;" type="text" name="txtfilme" size="50" value="<%=film.getFilme() %>"><br><br>
		Genero: <input style="margin-left: 40px;" type="text" name="txtgenero" size="50" value="<%=film.getGenero() %>"><br><br>
		Classificação: <input type="text" name="txtclassificacao" size="50" value="<%=film.getClassificacao() %>"><br><br><br><br>
		
		<input type="submit" value="Editar Filme">
	</form>

</body>
</html>