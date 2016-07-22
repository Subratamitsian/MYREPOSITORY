<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
<h3>Message:${message} </h3>
<h2>UserName:${username}</h2>
<a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
</body>
</html>