<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
<form:form action="${pageContext.request.contextPath}/dosya?${test}" method="GET">
	<tr>
		<td>
			Dosya Adini Giriniz: <input type="text" name="test" /><br />
			<input type="submit" value="Gonder">
		</td>
	</tr>
</form:form>

	

</table>

</body>
</html>