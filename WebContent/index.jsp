<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/testXML" method="POST">
<table>
	<tr>
	<td>
		Mevzuat Adı:
	</td>
	<td><input type="text" name="mevzuatAdi" /></td>
	</tr>
	<tr>
		<td>
		Mevzuat İçerik:
		</td>
		<td><textarea rows="4" cols="50" name="mevzuatIcerik"></textarea></td>
	</tr>
	<tr>
		<td>Mevzuat Tarihi:</td>
		<td><input type="text" name="tarihi" /></td>
	</tr>
	<tr>
		<td>Resmi Gazete No:</td>
		<td><input type="text" name="resmiGazeteNo" /></td>
	</tr>
	
	<tr>
		<td>Bent Adı:</td>
		<td><input type="text" name="bentAdi" /></td>
	</tr>
	<tr>
		<td>Bent İçerik:</td>
		<td><textarea rows="4" cols="50" name="bentIcerik"></textarea></td>
	</tr>
	<tr>
		<td>Alt Bent İçerik:</td>
		<td><textarea row="4" cols="50" name="altBentIcerik"></textarea></td>
	</tr>
	<tr>
		<td>Alt Bent Adı:</td>
		<td><input type="text" name="altBentAdi" /></td>
	</tr>
	<tr>
		<td colspan="2"><input type="submit" value="Gönder" /></td>
	</tr>
	</table>
</form>

</body>
</html>