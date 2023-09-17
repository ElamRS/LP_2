<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Gravar Mensagem</title>
	</head>
	<body>
		<%
			ArrayList<String> emails = new ArrayList<String> ();
		
			if (session.getAttribute("emails") != null)
				emails = (ArrayList) session.getAttribute("emails");
			
			ArrayList<String> mensagens = new ArrayList<String> ();
			
			if (session.getAttribute("mensagens") != null)
				mensagens = (ArrayList) session.getAttribute("mensagens");
		
			String email = request.getParameter("email");
			String mensagem = request.getParameter("mensagem");
			
			emails.add(email);
			mensagens.add(mensagem);
			
			session.setAttribute("emails", emails);
			session.setAttribute("mensagens", mensagens);
			
			response.sendRedirect("listarMensagens.jsp");
		%>
	</body>
</html>