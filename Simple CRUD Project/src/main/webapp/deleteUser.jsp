<html>
	<head>
		<title> Welcome to .com </title>
	</head>
	<body>
		<h2> Deleted User information </h2>
			<c:if test = "${userTable.name != null}">
				${userTable} deleted...
			</c:if>
			
			<c:if test = "${userTable.name == null}">
				${message}
			</c:if>
	</body>
</html>