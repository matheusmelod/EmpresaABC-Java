<%@page import="br.uninove.entidade.Filme"%>
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
	
	<h1>Mostrar todos Filmes</h1>
	
	<input style="margin-bottom:20px;" type="button" name="qqnome" value="Criar" onClick="javascript:window.location='cadastro.html'"/>
	
	<table style="text-align:center" border=1 cellspacing="0" width="70%">
		<tr bgcolor="black"  style="color:pink">
			<th>ID</th><th>FILME</th><th>GENERO</th><th>CLASSIFICAÇÂO</th><th colspan="2">Ação</th>
		</tr>
		
			<%
				List<Filme> lista = (List<Filme>)request.getAttribute("listaFilme");
				
				for(Filme film:lista){
			%>
	
		<tr>
			<td><%=film.getId() %></td><td><%=film.getFilme() %></td><td><%=film.getGenero() %></td><td><%=film.getClassificacao() %></td><td><a href="excluirfilme.do?codigo=<%=film.getId() %>">Excluir</a></td><td><a href="obterdados.do?id=<%=film.getId() %>">Alterar</a></td>
		</tr>
		
		<%
				}
		%>
		
	</table>
</body>
</html>