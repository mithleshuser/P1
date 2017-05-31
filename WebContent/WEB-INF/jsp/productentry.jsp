<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>stock entry form</title>
</head>
<body>

	<h2>
		<spring:message code="lbl.page" text="Product Entry in Stock" />
	</h2>
	<br />
	<form:form action="productentry.html" method="post" modelAttribute="admin">
		<%-- <form:errors path="*" cssClass="error" /> --%>
		<table>
			<tr>
				<td><spring:message code="lbl.productId" text="Product Id" /></td>
				<td><form:input path="productId" /></td>
				<td><form:errors path="productId" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.adminname" text="SI.NO" /></td>
				<td><form:input path="si_no" /></td>
				<td><form:errors path="si_no" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.productName" text="Product Name" /></td>
				<td><form:input path="productName" /></td>
				<td><form:errors path="productName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.ProductType" text="Product Type" /></td>
				<td><form:input path="ProductType" /></td>
				<td><form:errors path="ProductType" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.issueAt" text=" Date Of Issue" /></td>
				<td><form:input path="Date" /></td>
				<td><form:errors path="Date" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.entryAt" text="Date Of Entry" /></td>
				<td><form:input path="Date" /></td>
				<td><form:errors path="Date" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.quantity" text="Quantity" /></td>
				<td><form:input path="quantity" /></td>
				<td><form:errors path="quantity" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.price" text="total" /></td>
				<td><form:input path="price" /></td>
				<td><form:errors path="price" cssClass="error" /></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.total" text="Total" /></td>
				<td><form:input path="total" /></td>
				<td><form:errors path="total" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Submit Product" /></td>
			</tr>

		</table>
	</form:form>
</body>
</html>