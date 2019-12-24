<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empresas</title>
</head>
<body>
	<h1>Editando empresa ${empresa}</h1>
	<form action='editarEmpresa?id=${id}' method='post'>
		Nome da empresa : <input type='text' name='nome' value='${empresa}'> <br>
		Data de abertura: <input type='text' name='data'value='<fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/>'> <br>
		<input type='submit' value='Salvar'>
	</form>		
</body>
</html>