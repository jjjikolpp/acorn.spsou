<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
자료 입력 <br>
<sform:form commandName="command">
i d : <sform:input path="userid"/><br>
pwd : <sform:password path="passwd"/><br>
<input type="submit" value="전송">
</sform:form>
<hr>
자료 입력2 <br>
<form id="command" action="/spring_mvc7_para_post/login" method="post">
i d : <input id="userid" name="userid" type="text" value=""/><br>
pwd : <input id="passwd" name="passwd" type="password" value=""/><br>
<input type="submit" value="전송">
</form>

</body>
</html>