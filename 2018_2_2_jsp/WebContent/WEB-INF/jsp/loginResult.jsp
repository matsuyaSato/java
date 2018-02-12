<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.User" %>
    <%
    User loginUser = (User) session.getAttribute("loginUser");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ログイン</h1>
<% if(loginUser != null){ %>
<p>ログインに成功しました。</p>
<p>ようこそ<%= loginUser.getName() %>さん</p>
<a href="/2018_2_2_JSP/Main">つぶやき投稿・一覧へ</a>
<% }else{ %>
<p>ログインに失敗しました。</p>
<a href="/2018_2_2_JSP/">TOPへ</a>
<%} %>

</body>
</html>