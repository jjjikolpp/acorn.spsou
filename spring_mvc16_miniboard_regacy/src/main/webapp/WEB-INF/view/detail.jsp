<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<td>번호</td>
		<td>${dto.num }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${dto.author }</td>
	</tr>
	<tr>
		<td>제목</td>
		<td>${dto.title }</td>
	</tr>
	<tr>
		<td>작성일</td>
		<td>${dto.bwrite }</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td>${dto.readcnt }</td>
	</tr>
	
	<tr>
		<td>내용</td>
		<td>${dto.content }</td>
	</tr>

</table>
<a href="list">리스트로</a><br><a href="update?num=${dto.num }">수정</a>
</body>
</html>