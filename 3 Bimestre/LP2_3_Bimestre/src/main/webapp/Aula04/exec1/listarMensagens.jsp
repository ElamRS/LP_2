<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Mensagens Enviadas</title>
		<style>
			body {
				background-color: beige;
			}
		
			ul {
				list-style: none;
				border: 1px solid black;
				border-radius: 5px;
				width: 400px;
				padding: auto;
				padding-left: none;
				margin: auto;
				
				background-color: lightgreen;
			}
			
			li {
				border: 0.5px solid black;
				border-radius: 5px;
				margin: 5px;
				
				background-color: white;
			}
			
			.header {
				margin: auto;
				margin-bottom: 10px;
				text-align: center;
				
				border: 2px solid black;
				border-radius: 5px;
				
				color: white;
				background-color: lightblue;	
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
			<h1>Mensagens Enviadas pelos Leitores</h1>
			<a href="novaMensagem.jsp">Enviar Mensagem</a>
		</div>
	
		<ul> 
			<% 
				ArrayList<String> emails = (ArrayList) session.getAttribute("emails");
				ArrayList<String> mensagens = (ArrayList) session.getAttribute("mensagens");
			
				if (emails != null && mensagens != null) {
					for (int i = 0; i < emails.size(); i++) {
						out.println("<li><b>E-Mail:</b> " + emails.get(i) + "</li>");
						out.println("<li><b>Mensagem:</b> " + mensagens.get(i) + "</li><br>");
					}
				}
			%>
		</ul>
	</body>
</html>