<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
<head>
<title>Add Employee Form</title>
<style>
.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
</head>

<body>
	<h2>
		<spring:message code="lbl.page" text="Add New Employee" />
	</h2>
	<br />
	<form:form action="creatEmployeForm.html" method="post" modelAttribute="employee">
		<%-- <form:errors path="*" cssClass="error" /> --%>
		<table>
		    <tr>
				<td><spring:message code="lbl.sc_no" text="Smart card Number" /></td>
				<td><form:input path="sc_no" /></td>
				<td><form:errors path="sc_no" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.firstName" text="First Name*" /></td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.lastName" text="Last Name*" /></td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.email" text="Email Id*" /></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.centercode" text="Center Code*" /></td>
				<td><form:input path="center" /></td>
				<td><form:errors path="center" cssClass="error" /></td>
			</tr>

			<tr>
				<td><spring:message code="lbl.phonNo" text="Phon Number*" /></td>
				<td><form:input path="phonNo" /></td>
				<td><form:errors path="phonNo" cssClass="error" /></td>
			</tr>

			<tr>
				<td><spring:message code="lbl.sex" text="Sex*" /></td>
				<td><form:radiobutton path="sex" value="M" />Male <form:radiobutton
						path="sex" value="F" />Female</td>
				<td><form:errors path="sex" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.age" text="Age " /></td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.language" text="Language" /></td>
				<td><form:input path="language" /></td>
				<td><form:errors path="language" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.qualification" text="Qualification" /></td>
				<td><form:input path="qualification" /></td>
				<td><form:errors path="qualification" cssClass="error" /></td>
<%-- 			
			<tr>
				<td><spring:message code="lbl.state" text="State" /></td>
				<td><form:select path="state" rows="5" cols="30" /></td>
				<td><form:errors path="state" cssClass="error" /></td>
			</tr> 
			
			<tr>
				<td><spring:message code="lbl.poolic" text="Poolic Station" /></td>
				<td><form:input path="poolic" rows="5" cols="30" /></td>
				<td><form:errors path="poolic" cssClass="error" /></td>
			</tr>
				<tr>
				<td><spring:message code="lbl.pin_code" text="Pin Code" /></td>
				<td><form:input path="pin_code" /></td>
				<td><form:errors path="pin_code" cssClass="error" /></td>
			</tr>
			--%>
			<tr>
				<td><spring:message code="lbl.city" text="City*" /></td>
				<td><form:select path="city" items="${listOfCity}" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr> 
			<tr>
				<td><spring:message code="lbl.profasnal" text="Profasnal*" /></td>
				<td><form:input path="profasnal" rows="5" cols="30" /></td>
				<td><form:errors path="profasnal" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.Date" text="Date of knowLedge" /></td>
				<td><form:input path="knowLedgeDate" rows="5" cols="30" /></td>
				<td><form:errors path="knowLedgeDate" cssClass="error" /></td>
			</tr>

			<tr>
				<td><spring:message code="lbl.interest" text="Interest in Seba*" /></td>
				<td><form:checkboxes items="${interestArea}" path="interest" itemLabel="name" itemValue="name" /></td>
			<%-- 	<td><form:errors path="interest" cssClass="error" /></td> --%>
			</tr>
			<tr>
				<td><spring:message code="lbl.overview" text="Overview*" /></td>
				<td><form:textarea path="overview" rows="5" cols="30" /></td>
				<td><form:errors path="overview" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.pwd" text="Password" /></td>
				<td><form:input path="pwd" rows="5" cols="30" /></td>
				<td><form:errors path="pwd" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.repwd" text="Re Password" /></td>
				<td><form:input path="re_pwd" rows="5" cols="30" /></td>
				<td><form:errors path="re_pwd" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add Employee" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
