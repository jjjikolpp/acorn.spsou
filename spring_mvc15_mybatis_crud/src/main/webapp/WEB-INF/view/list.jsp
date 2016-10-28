<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 회원 자료 (@MVC-MYBatis-CRUD) **<p>
<a href="insert">추가</a><br>
<table border="1">
	<tr>
		<th>num</th><th>name</th><th>addr</th>
	</tr>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:forEach var ="s" items="${list }">  
	<tr>
		<td>${s.num }</td>
		<td>${s.name }</td>
		<td>${s.addr }</td>
		<td>
			<a href="update?num=${s.num }">수정</a>
		</td>
		<td>
			<a href="delete?num=${s.num }">삭제</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>