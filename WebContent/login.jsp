<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>

<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<title>- Log-in</title>
<link rel="stylesheet" href="css/style.css">

</head><body>

	<div class="login-card">
		<h1>6X17-LOGIN</h1>
		<br>
		<html:form action="/login" method="post">
			<html:text property="userName"></html:text>
			<html:text property="passWord"></html:text>
			<html:submit value="Đăng nhập"></html:submit>
		</html:form>

		<div class="login-help">
			<a href="#">&copy; Copyright 2014 6x17.net, All rights reserved </a>
		</div>
	</div>

</body>

</html>