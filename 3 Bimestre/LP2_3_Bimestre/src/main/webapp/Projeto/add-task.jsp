<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>

	<%
	    String newTask = request.getParameter("task");
	    if (newTask != null && !newTask.isEmpty()) {
	        
	        ArrayList<String> tasks = (ArrayList<String>) session.getAttribute("tasks");
	        if (tasks == null) {
	            tasks = new ArrayList<>();
	        }
	        
	       
	        tasks.add(newTask);
	        
	        session.setAttribute("tasks", tasks);
	    }
	%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Adicionar Nova Tarefa</title>
		<style>
			body {
			    background-image: url('escritorio.jpg');
			    background-size: cover; 
			    background-repeat: no-repeat; 
			    color: white; 
			    font-family: Arial, sans-serif; 
			}
			
			h1 {
			    color: #2c3e50;
			}
			
			ul {
			    list-style-type: circle; 
			}
			
			li {
			    margin: 5px 0; 
			}
			
			.caixa {
			    border: 10px solid orange; 
			    background-color: green;
			    padding: 10px; 
			    margin: 10px; 
			}
		</style>
	</head>
	<body>
		<div class = "caixa">
			<h1>Adicionar Nova Tarefa</h1>
		    <form action="add-task.jsp" method="post">
		        <label for="task">Nova Tarefa:</label>
		        <input type="text" name="task" required><br><br>
		        <input type="submit" value="Adicionar">
		    </form>
			<br>
			<a href="index.jsp">Voltar para a Lista de Tarefas</a>
		</div>
	</body>
</html>