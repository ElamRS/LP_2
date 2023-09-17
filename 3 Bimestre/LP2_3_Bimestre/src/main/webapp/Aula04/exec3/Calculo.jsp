<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
			<%
				Double num1 = 0.0, num2 = 0.0;
				Double result = 0.0;
				String op = "";
			
				if (request.getParameter("valor1")!=null)
					num1 = Double.parseDouble(request.getParameter("valor1"));
				
				if (request.getParameter("valor2")!=null)
					num2 = Double.parseDouble(request.getParameter("valor2"));
				
				if (request.getParameter("operacao") != null) {
					op = request.getParameter("operacao");
					
					switch (op) {
						case "+":
							result = num1 + num2;
							session.setAttribute("resultado", result);
							break;
						case "-":
							result = num1 - num2;
							session.setAttribute("resultado", result);
							break;
						case "x":
							result = num1 * num2;
							session.setAttribute("resultado", result);
							break;
						case "/":
							result = num1 / num2;
							session.setAttribute("resultado", result);
							break;
						default:
							break;
					}
				}
				
				response.sendRedirect("Calculadora.jsp");
			 %>
	</body>
</html>