<html>
	<head>
		<title> Welcome to .com </title>
	</head>
	<body>
		<h2> User information to be updated </h2>
		${userTable.id} - ${userTable.name} 
		
			<form action = "addUser">
				Enter ID <input type = "text" name = "id"> <br>
				Enter Name <input type = "text" name = "name"> <br>
				<input type="submit"> <br>
			</form>
			
			<a href = "home.jsp"> Return to the home page </a>
	</body>
</html>