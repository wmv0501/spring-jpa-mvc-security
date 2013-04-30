<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link rel="stylesheet" type="text/css" media="screen" href="resources/css/style.css"/>
	<title>Admin</title>
</head>

<body>
	<jsp:include page="menu.jsp" />
	<h1 id="banner">Admin</h1>
	<hr/>
	<div>List of Users</div>
	<ul>
	 	<c:forEach var="user" items="${userList}"><li>[${user.firstName}]</li></c:forEach>
	<ul>
</body>
</html>