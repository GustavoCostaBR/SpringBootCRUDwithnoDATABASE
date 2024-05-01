<html>

<head>
<title>ToDo Application</title>
</head>

<body>

	<%@ include file="navigation.jspf"%>

	<h1>Update ToDo</h1>

	<form method="post">
		<label>Title</label> <input type="text" name="title" required
			autofocus value="${toDo.title}" /> <br /> <label>Description</label>
		<input type="text" name="description" required autofocus
			value="${toDo.description}" /> <br /> <label>Scheduled Date</label>
		<input type="datetime-local" name="scheduledDate" required autofocus
			value="${toDo.scheduledDate}" /> <br /> <input type="submit"
			name="submit" value="Update" />

	</form>

</body>

</html>
