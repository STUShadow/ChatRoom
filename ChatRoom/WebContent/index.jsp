<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログインページ</title>
</head>
<body>
	<form action="/ChatRoom/Login" method="post">
		ID：<input type="text" id="id" /><br> 
		パスワード：<input type="password" id="password" /><br> <input type="submit" value="ログイン">
	</form>
	<a href="/ChatRoom/jsp/signUp.jsp">新規作成</a>
</body>
</html>