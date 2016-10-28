<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 회원 자료 수정 **<p>
<form:form action="${dto.no }" method="put">
번호 : <input type="text" name="no" value="${dto.no }" disabled="disabled"><br>
이름 : <input type="text" name="name" value="${dto.name }"><br>
나이 : <input type="text" name="age" value="${dto.age }"><br>
전화 : <input type="text" name="tel" value="${dto.tel }"><br>
<button type="submit">등록</button>
</form:form>
</body>
</html>