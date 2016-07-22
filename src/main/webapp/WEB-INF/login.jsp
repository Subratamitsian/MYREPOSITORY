<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<%@ page isELIgnored="false" %>
</head>
<body>
<h3>Welcome to Login Page!!!! </h3>

<form name= "f"  action="/SpringWithSecurity/welcome"<%-- action="<c:url value='j_spring_security_check'/>" --%> method="POST">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
User:- <input type="text" name="j_username" value=""/>
Password:- <input type="password" name='j_password'/>

<input name="submit" type="submit" value="Submit"/>
</form>
</body>
</html>