<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<html:form action="/editContent" method="post">
	    <html:hidden property="id"/>
		MO: <html:text property="mo"></html:text>
		<br />
		MT: <html:text property="mt"></html:text>
		<br />
		<html:submit value="Add/Edit"></html:submit>
	</html:form>
</body>
</html>