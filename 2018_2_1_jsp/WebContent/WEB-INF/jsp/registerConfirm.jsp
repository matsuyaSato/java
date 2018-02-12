<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>下記のユーザーを登録します</p>
<p>
ログインID:<%= registerUser.getId() %><br>
名前:<%= registerUser.getName() %><br>
</p>
<a href="/2018_2_1_jsp/RegisterUser">戻る</a>
<a href="/2018_2_1_jsp/RegisterUser?action=done">登録</a>
</body>
</html>