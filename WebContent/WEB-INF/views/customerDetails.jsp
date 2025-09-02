<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form method="POST" modelAttribute="${pageContext.request.contextPath}/customer" action="/addCustomer">
	<form:label path="id">#ID</form:label>
	<form:input path="id" size="30" maxlength="30"/>
	<br />
	<form:label path="name">AD</form:label>
	<form:input path="name" size="30" maxlength="30"/>
	<br />
	<form:label path="age">YAS</form:label>
	<form:input path="age" size="4" maxlength="4"/>
	<br />
	<input type="submit" value="Gönder"/>

</form:form>

</body>
</html>