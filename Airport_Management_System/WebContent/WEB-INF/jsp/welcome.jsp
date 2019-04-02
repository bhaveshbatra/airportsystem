
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page isELIgnored = "false" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <table>
<tr>
<th>Admin ID</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Gender</th><th>DOB</th><th>Contact</th><th>alt_contact</th><th>Email</th>
</tr>
<c:forEach items="${adminList}" var="admin">

<tr>
<td><c:out value="${admin.id}"/></td>
<td><c:out value="${admin.fname}"/></td>

<td><c:out value="${{admin.lname}}"/></td>
<td><c:out value="${admin.age}"/></td>
<td><c:out value="${admin.gender}"/></td>
<td><c:out value="${admin.dob}"/></td>
<td><c:out value="${admin.number}"/></td>
<td><c:out value="${admin.altnumber}"/></td>
<td><c:out value="${admin.email}"/></td>
</tr>

</c:forEach>
</table>
 --%>
<input type="submit" value="Add Plane"/>
<input type="submit" value="Add Pilot"/>


<form method="post" action="viewdetails.htm">
<input type="submit" value="Manager Details"/>
</form>
</body>
</html>