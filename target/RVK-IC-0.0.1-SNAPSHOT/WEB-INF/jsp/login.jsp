<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div
		style="border: 2px solid; position: relative; color: black; background-color: #5A85A7;">
		<center>
			<h1>LOGIN WITH</h1>
			<form method="post" action="LoginWithEmailID"
				enctype="multipart/form-data">

				<table border="0">
					<tr>
						<td>Email Id</td>
						<td><input type="text" name="uemail" size="50" /></td>
					</tr>
					<tr>
						<td>password:</td>
						<td><input type="password" name="upassword" size="50" /></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Login" /></td>
						<td>
						<th colspan="2"><a href="loginOption">Login Option !!</a></th>
						</td>
					</tr>
					<tr>
						<td>
						<th colspan="2"><a href="searchyourpwd">forgot password!!</a></th>
						</td>
					</tr>

				</table>
			</form>
		</center>
	</div>

</body>
</html>