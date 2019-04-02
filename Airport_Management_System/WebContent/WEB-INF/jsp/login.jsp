<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="admin" method="post" action="doLogin.htm">
<table>
<tr>
<td><form:label path="id">ID:</form:label>
<td><form:input path="id"/>
</td>
</tr>
<tr>
<td><form:label path="password">Password:</form:label>
<td><form:password path="password"/>
</td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
<form:errors path="id" style="color:red"></form:errors>
<form:errors path="password" style="color:red"></form:errors>
</form:form>

</body>
</html>