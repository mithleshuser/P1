<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<title>Add Admin Form</title>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
</head>

<body>
	<h2>
		<spring:message code="lbl.page" text="Add New Admin" />
	</h2>
	<br />
	<form:form action="createAdminForm.html" method="post" modelAttribute="admin">
		<table>
			<tr>
				<td><spring:message code="lbl.adminids" text="Admin id" /></td>
				<td><form:input path="u_id" /></td>
				<td><form:errors path="u_id" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.adminname" text="Admin Name" /></td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.adminpassword" text="Password" /></td>
				<td><form:textarea path="upwd" rows="5" cols="30" /></td>
				<td><form:errors path="upwd" cssClass="error" /></td>
			</tr>
		     <tr>
				<td><form:select path="roll" items="${listOfRoll}" /></td>
				<td><form:errors path="roll" cssClass="error" /></td>
			</tr> 
 			<tr> 
 				<td><spring:message code="lbl.adminprevleage" text="Admin prevleage" /></td> 
 				<td><form:checkboxes items="${listOfPrivilege}" path="roll.prevleage" itemLabel="prevlageName" itemValue="prevlageName" /></td> 
 				<%-- <td><form:errors path="roll.prevleage" cssClass="error" /></td>   --%>
 			</tr> 
			<tr>
				<td colspan="3"><input type="submit" value="SUBMIT ADMIN " /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>