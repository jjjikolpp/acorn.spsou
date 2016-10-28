<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
** 회원 자료 ** (JdbcDaoSupprot) <br/>
<table border="1">
	<tr><td colspan="2"><a href="insert">추가</a></td></tr>
	<tr>
		<th>id</th><th>name</th>
	</tr>
	<c:forEach var="m" items="${list }">
	<tr>
		<td>${m.id }</td>
		<td><a href="detail?id=${m.id }">${m.name }</a></td>
	</tr>
	</c:forEach>
</table>
 -->
** 회원 자료 ** (JdbcDaoSupprot) <br/>
<c:if test="${ count == 0}">
출력자료가 없어요 <a href="insert">추가</a>
</c:if> 

<c:if test="${count > 0 }">
<table border="1">
	<tr><td colspan="2"><a href="insert">추가</a></td></tr>
	<tr>
		<th>id</th><th>name</th>
	</tr>
	<c:forEach var="m" items="${list }">
	<tr>
		<td width="50">${m.id }</td>
		<td width="150"><a href="detail?id=${m.id }">${m.name }</a></td>
	</tr>
	</c:forEach>
	<!-- page link -->
	<tr>
		<td colspan="2" style="text-align:center; height: 30px">
		<c:set var="pageCount" value="${(count -1) / pageSize + 1}"/>
		<c:forEach var="p" begin="1" end="${pageCount }">
			<c:if test="${currentPage == p }">${p }</c:if>
			<c:if test="${currentPage != p }">
				<a href="list?pagenum=${p }">${p }</a>
			</c:if>
		</c:forEach>
		</td>
	</tr>
</table>
</c:if>
</body>
</html>