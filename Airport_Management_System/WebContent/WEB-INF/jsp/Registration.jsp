<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration page</title>
</head>
<body>
<form:form modelAttribute="admin" method="post" action="registrationadmin.htm">
<table>
<%-- <tr>
<td>Enter Id </td>
<td><form:input path="id"/></td>
</tr>  --%>
<tr>
<td>Enter First Name </td>
<td><form:input path="fname"/></td>
</tr>
<tr>
<td>Enter Last Name </td>
<td><form:input path="lname"/></td>
</tr>
<tr>
<td>Enter Age </td>
<td><form:input path="age"/></td>
</tr>
<tr>
<td>Enter Gender </td>
<td><form:input path="gender"/></td>
</tr>
<tr>
<td>Enter Date Of Birth </td>
<td><form:input path="dob"/></td>
</tr>
<tr>
<td>Enter Contact Number </td>
<td><form:input path="number"/></td>
</tr>
<tr>
<td>Enter Alternate Contact Number </td>
<td><form:input path="altnumber"/></td>
</tr>
<tr>
<td>Enter Email </td>
<td><form:input path="email"/></td>
</tr>
<tr>
<td>Enter Password </td>
<td><form:password path="password"/></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>

</form:form>


</body>
</html>