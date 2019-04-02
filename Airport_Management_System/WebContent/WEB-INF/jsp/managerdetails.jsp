
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
<table>
<tr>
<th>Manager ID</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Gender</th><th>DOB</th><th>Contact</th><th>alt_contact</th><th>Email</th><th>Password</th><th>Status</th>
</tr>
<c:forEach items="${managerList}" var="manager">

<tr>
<td><c:out value="${manager.manager_id}"/></td>
<td><c:out value="${manager.manager_first_name}"/></td>

<td><c:out value="${manager.manager_last_name}"/></td>
<td><c:out value="${manager.manager_age}"/></td>
<td><c:out value="${manager.manager_gender}"/></td>
<td><c:out value="${manager.manager_dob}"/></td>
<td><c:out value="${manager.manager_contact_no}"/></td>
<td><c:out value="${manager.manager_alt_contact_no}"/></td>
<td><c:out value="${manager.manager_email_id}"/></td>
<td><c:out value="${manager.manager_password}"/></td>
<td><a href="approve.htm">Approve</a>
<td><a href="reject.htm">Reject</a>
<%-- <td><c:out value="Approve    Reject "/></td> --%>
</tr>

</c:forEach>
</table>

</body>
</html>