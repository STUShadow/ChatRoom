<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bean.LoginBean"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	List loginList = (List) request.getAttribute("login");
%>
<title>ホーム</title>
</head>
<body>
	ルームリスト
	<form action = "/ChatRoom/RoomEnter" method = "post">
		<%
			for (Object bean : loginList) {
		%>
		ルーム名：<%=((LoginBean) bean).getId()%>:<%=((LoginBean) bean).getPassword()%>
		<input type="submit" value="入室"><br>
		<%
			}
		%>
	</form>
</body>
</html>