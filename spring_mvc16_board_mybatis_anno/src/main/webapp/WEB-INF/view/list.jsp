<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 게시판 **
<table border="1">
	<tr>
		<th>글번호</th><th>작성자</th><th>제목</th><th>조회수</th>
	</tr>
	<c:forEach var="s" items="${dto }">
	<tr>
		<td>${s.num }</td>
		<td>${s.author }</td>
		<td><a href="detail?num=${s.num }">${s.title }</a></td>
		<td>${s.readcnt }</td>
	</tr>
	</c:forEach>
</table>
<c:set var="pageCount" value="${(count -1) / pageSize + 1}"/>
		<c:forEach var="p" begin="1" end="${pageCount }">
			<c:if test="${currentPage == p }">${p }</c:if>
			<c:if test="${currentPage != p }">
				<a href="list?pagenum=${p }">${p }</a>
			</c:if>
		</c:forEach><br>
<a href="write">글쓰기</a><br>
<form action="search">
<select name="searchList">
	<option value="author">작성자</option>
	<option value="title">제목</option>
</select>
<input type="text" name="searchValue">
<input type="submit" value="검색">
</form>
</body>
</html>

