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
	Mevzuat Adı:<input type="text" name="mevzuatAdi" /><br />
	Mevzuat İçerik:<input type="text" name="mevzuatIcerik" /><br />
	Mevzuat Tarihi:<input type="text" name="tarihi" /><br />
	Resmi Gazete No:<input ty="text" name="resmiGazeteNo" /><br />
	<hr />
	Bent Adı:<input type="text" name="bentAdi" /><br />
	Bent İçerik:<input type="text" name="bentIcerik" /><br />
	<hr />
	Alt Bent İçerik:<input type="text" name="altBentIcerik" />
	Alt Bent Adı:<input type="text" name="altBentAdi" />
	
	<input type="submit" value="Gönder" />
</form>

</body>
</html>