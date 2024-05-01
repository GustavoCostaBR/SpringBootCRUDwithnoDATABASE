<%@page import="ch.qos.logback.core.net.SyslogOutputStream"%>
<%@ page import="java.util.List" %>
<%@ page import="com.allogica.ToDoApp.models.entities.ToDo" %>
<%@ page import="java.time.format.DateTimeFormatter" %>


<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>
		View ToDo List
		</title>
	</head>
	
	<body>
		
		<%@ include file="navigation.jspf" %>
		
		<h1>
			All ToDo List
		</h1>
		
		
		<% List<ToDo> toDoList = (List<ToDo>) request.getAttribute("toDos");
		   for (int i = 0; i < toDoList.size(); i++){
		%>
			<div>
				<p>Title: <%= toDoList.get(i).getTitle() %></p>
				<p>Description: <%= toDoList.get(i).getDescription() %></p>
				<p>Date and time: <%= toDoList.get(i).getScheduledDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")) %></p>
			</div>
			<a href="update?id=<%= i %>">Update</a>
			<a href="delete?id=<%= i %>">Delete</a>
			<br />
			
		<%
			}
		%>
		
		
		
		
	</body>
	
</html>