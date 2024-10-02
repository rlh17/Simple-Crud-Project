<html>
	<head>
		<title> Welcome to .com </title>
	</head>
	<body>
		<h2> User information to be updated </h2>
				<c:if test = ${not empty message}>
					${message}
				</c:if>
				<c:if test = ${not empty userTable}>
					${userTable} 
					
					<form action = "addUser">
						Enter ID <input type = "text" name = "id"> <br>
						Enter Name <input type = "text" name = "name"> <br>
					<input type="submit"> <br>
					</form>
				</c:if>
	</body>