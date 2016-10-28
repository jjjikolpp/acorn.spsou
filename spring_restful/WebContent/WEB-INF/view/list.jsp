<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 자료</h3>
<table border="1">
	<tr>
		<th>no</th><th>name</th><th>age</th><th>tel</th><th>delete</th>
	</tr>
	<c:forEach var="m" items="${list }">
		<tr>
			<td><a href="member/${m.no}">${m.no }</a> 수정</td>
			<td>${m.name }</td>
			<td>${m.age }</td>
			<td>${m.tel }</td>
			<td>
				<form:form action="member/${m.no }" method="delete">
					<a href="javascript:" onclick="parentElement.submit()">del</a>
				</form:form>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>