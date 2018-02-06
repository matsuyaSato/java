<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Health" %>
<%
Health health = (Health) request.getAttribute("health");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>健康診断の結果</h1>
<p>
	身長:<%= health.getHeight() %>
	体重:<%= health.getWeight() %>
	BMI:<%= health.getBodyType() %>
</p>
<a href="/2018_2_1_jsp/HealthCheck">戻る</a>

</body>
</html>