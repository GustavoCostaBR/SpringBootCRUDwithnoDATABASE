<html>
	
	<head>
		<title>
			ToDo Application	
		</title>
	</head>
	
	<body>
		
		<%@ include file="navigation.jspf" %>
		
		<h1>
			Create New ToDo
		</h1>
		
		<form method="post">
			<label>Title</label>
			<input type="text" name="title" required autofocus />
			<br />
			<label>Description</label>
			<input type="text" name="description" required autofocus />
			<br />
			<label>Scheduled Date</label>
			<input type="datetime-local" name="scheduledDate" required autofocus />
			<br />
			<input type="submit" name="submit"
				value="Create"/>
			
		</form>
		
	</body>
	
</html>
