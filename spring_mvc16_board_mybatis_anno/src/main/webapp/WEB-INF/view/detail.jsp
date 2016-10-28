<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 글 보기 **
<table border="1" height="70%" width="70%">
	<tr>
		<td>번호</td><td>${data.num }</td>
		<td>조회수</td><td>${data.readcnt }</td>
	</tr>
	<tr>
		<td colspan="2">title</td><td colspan="2">${data.title }</td>
	</tr>
	<tr>
		<td>author</td><td>${data.author }</td>
		<td>작성일</td><td>${data.bwrite }</td>
	</tr>
	<tr>
		<td colspan="4" height="700px">${data.content }</td>
	</tr>
</table>
<a href="list">리스트로</a><br>
<a href="update?num=${data.num }">수정</a><br>
<a href="delete?num=${data.num }">지우기</a><br>
<a href="replay?num=${data.num }&gnum=${data.gnum }&onum=${data.onum}&nested=${data.nested}">댓글</a>
</body>
</html>