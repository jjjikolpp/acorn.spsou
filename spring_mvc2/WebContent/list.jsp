<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
성공입니다.<br>
<%
String str = (String) request.getAttribute("say"); 
out.println("메시지니는" + str);
%>
<br>
메시지는 ${requestScope.say } ${say} 
</body>
</html>