<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 사원 자료 출력 **
<table border="1">
	<tr>
		<th>사번</th><th>이름</th><th>직급</th><th>부서명</th><th>관리고객</th>
	</tr>
	<c:forEach var="s" items="${sawon_list}">
	<tr>
		<td>${s.sawon_no }</td>
		<td>
		<c:if test="${s.gogek == 'o'}">
		<a href="gogek?sawon_name=${s.sawon_name }&sawon_no=${s.sawon_no}">
		${s.sawon_name }</a>
		</c:if>
		<c:if test="${s.gogek == 'x'}">
		${s.sawon_name }
		</c:if>
		</td>
		<td>${s.sawon_jik }</td>
		<td>${s.buser_name }</td>
		<td>${s.gogek }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>