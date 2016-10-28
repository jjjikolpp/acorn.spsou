<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 미니 게시판(전통적 DB 연결) ** <p/>
<a href="write">글쓰기</a>
<table border="1">
	<tr>
		<th>번호</th><th>제목</th><th>작성자</th><th>조회수</th>
	</tr>
	<c:forEach var="s" items="${list }">
		<tr>
			<td>${s.num }</td>
			<td><a href="detail?num=${s.num}">${s.title }</a></td>
			<td>${s.author }</td>
			<td>${s.readcnt }</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="4">
			<form action="ssearch" method="post">
				<select name = "searchName">
					<option value="author">작성자</option>
					<option value="title">제목</option>
				</select>
				<input type="text" name="searchName">
				<input type="submit" value="검색">
			</form>
		</td>
	</tr>
</table>

</body>
</html>