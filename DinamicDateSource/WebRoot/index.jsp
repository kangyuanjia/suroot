<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	//response.sendRedirect(request.getContextPath() + "/base/hello.do");

%>
hello world!
<html >
<head>
	<meta charset="UTF-8">
	<title>index</title>
	
</head>
	<body>
		<form action="${pageContext.request.contextPath}/base/hello.do" type = "post">
			<input type="submit" value ="提交">
		</form>
		<form action="${pageContext.request.contextPath}/base/annotation.do" type = "post">
			<input type="submit" value ="aop测试">
		</form>
	</body>
</html>