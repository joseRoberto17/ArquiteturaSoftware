<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="css/principal.css" rel="stylesheet" type="text/css" />
	<title>Tela de login</title>
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
</head>
<style type="text/css">

.formDentro .dentro {

	position: relative;
	width: 40%;
}

.formDentro {
	margin-top: 15%;
	margin-bottom: 15%;
	background-color: #b6d4f9;
	border: 1px solid rgba(0, 0, 0, .2);
	width: 350px;
	height: 260px;
	border-radius: 20px;
}
</style>
<body>
	<div id="main" class="container">
		
				<div class="formDentro">
					<div class="form-group col-md-12">
						<h2 class="page-header">Login</h2>
						<form action="fazer_Login" method="post" style="margin-left: 20px; margin-right: 20px">
							<div class="row col-md-12">
								<div class="form-group">
									<div class="input-group col-md-12">
										<div class="input-group-addon">
											<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
										</div>
										<input type="text" name="username" id="username" class="form-control" maxlength="60" placeholder="Login" required />
									</div>
								</div>
								<div class="form-group">
									<div class="input-group col-md-12">
										<div class="input-group-addon">
											<span class="glyphicon glyphicon-option-horizontal" aria-hidden="true"></span>
										</div>
										<input type="password" name="senha" id="senha" class="form-control" placeholder="Senha" required />
									</div>
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-success" name="acao">
										OK
									</button>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		
</body>
</html>