<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.lang.Math" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Calculadora Leibniz</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<style>
			body {
				background-color: blue;
			}
		
			h1 {
				color: white;
			}
			
			nav {
				border: 2px solid white;
				border-radius: 5px;
				margin-bottom: 5vw;
				
				background-color: lightblue;

			}
			
			#navbar {			
				text-align: center;
			}
			
			.calculadora {
				border: 2px solid black;
				border-radius: 10px;
				margin: auto;
				width: 40vw;
				height: 20vw;
				
				display: flex;
				align-items: center;
				justify-content: center;
				text-align: center;
				
				background-color: lightgreen;	
			}
			
			input {
				color: red;
				margin: 3px;
				background-color: lightblue;
				
				border-radius: 5px;
			}
			
			footer {
				border: 2px solid black;
				border-radius: 5px;
				
				display: flex;
				align-items: center;
				justify-content: center;
				text-align: center;
				margin-top: 22vw;
				
				color: white;
				background-color: #1c3442;
			}
			
			#footer {
				float: bottom;
			}
			
			a {
				text-decoration: none;
				color: white;
			}
		</style>
	</head>
	<body>
		<nav>
			<div id="navbar">
				<h1 style="color: red;">CALCULADORA LEIBNIZ</h1>
			</div>
		</nav>
		
		<div class="calculadora">
			<form action="Calculo.jsp" method="post">
				<h1 style="color: yellow;">Leibniz Online</h1>
				<!-- Caixa de Número onde o usuário digitará o número -->
				<label for="valor1">Primeiro Número: </label>
				<input type="number" name="valor1" style="width: 25vw;" required>
				
				<label for="valor1">Segundo Número: </label>
				<input type="number" name="valor2" style="width: 25vw;" required><br>
				
				<!-- Botão de Operações Matemáticas -->
				<label for="operacao">Operação: </label>
				<input type="text" name="operacao" style="width: 10vw;" placeholder="Operação" required>
				
				<input type="submit" value="=" style="background-color: gray; color: black;"><br>
				
				<%
					if (session.getAttribute("resultado") != null)
						out.println("<p><b>Resultado: </b>" + session.getAttribute("resultado") + "</p>");
				%>
			</form>
		</div>
		
		<footer>
			<div id="footer">
				<p>&copy; <a href="https://github.com/elamrs">Elam Rufino  <img src="github.png" alt="GitHub Logo" width="25" height="25"></a></p>
			</div>
		</footer>
		
		<script>
	        function setValueNull() {
	            document.getElementsById("valor1").value = null;
	            
	        }
    	</script>
	</body>
</html>