<html>
	<head>
		<title> Welcome to .com </title>
	</head>
	<body>
		<h2> User information </h2>
			<c:if test = "${userTable.name == null}">
				${message}...
			</c:if>
			<c:if test = "${userTable.name != null}">
				${userTable.id} - ${userTable.name}
			</c:if>
	</body>
</html>