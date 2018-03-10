<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Chamados</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">


				<title>Listar Chamados</title>


</head>
				<body>
 <c:import url="Menu.jsp" />

	<div class="col-md-6">
				<h2>Redes</h2>
	</div>


	<div class="table-responsive col-md-12">
		<table class="table table-striped" cellspacing="0" cellpadding="0">
			<thead>
				<tr>
					<th>Némero</th>
					<th>Descrição</th>
					<th>Abertura</th>
					<th>Fechamento</th>
					<th>Status</th>
					<th>Tempo</th>


				</tr>
			</thead>
			<tbody>

				<c:forEach var="filas" items="${filas}">

					<tr>
						<td>${chamado.id }</td>
						
						<td>${chamado.descricao }</td>

						<td>${chamado.dtFechamento }</td>

						<td>${chamado.dtAbertura }</td>

						<td>${chamado.status }</td>

						<td>${chamado.idFila }</td>
				
						
						
					</tr>
				</c:forEach>

			</tbody>
		</table>

	</div>

					</body>
</html>