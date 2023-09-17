<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Mensagem Nova</title>
		<style>
			body {
				background: purple;
			}
			
			h1 {
				color: yellow;
			}
			
			header {
				border: 1px solid black;
			}
			
			form {
				border: 2px solid black;
				border-radius: 5px;
				
				background-color: gray;
				width: 250px;
				margin: auto;
				padding: auto;
			}
			
			input {
				border: 0.5 solid black;
				background-color: lightgray;
				border-radius: 5px;
				color: white;
				
				margin: 5px;
			}
			
			.header {
				margin: auto;
				margin-bottom: 10px;
				text-align: center;
				
				border: 2px solid black;
				border-radius: 5px;
				
				color: yellow;
				background-color: lightgreen;	
			}
			
			a {
				border: 0.5px solid black;
				border-radius: 3px;
				background-color: white;
				color: black;
				text-decoration: none;
			}
		</style>
	</head>
	<body>
		<div class="header">
			<h1>Formulário dos Leitores</h1>
			<a href="listarMensagens.jsp">Ver mensagens Recebidas</a>
		</div>
	
		<form action="gravarMensagem.jsp" method="post">
			<input type="email" name="email" placeholder="Digite seu E-mail" required><br>
			<input type="text" name="mensagem" placeholder="Digite-nos Algo" required><br>
			<input type="submit" value="Registrar Mensagem">
		</form>
	</body>
</html>