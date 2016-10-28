<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 수정 **
<form action="update" method="post">
<table border="1" height="70%" width="70%">
	<tr>
		<td>번호</td><td>${data.num }</td>
		<td>조회수</td><td>${data.readcnt }</td>
	</tr>
	<tr>
		<td>title</td><td colspan="3">
		<input type="text"name="title" value="${data.title }">
		</td>
	</tr>
	<tr>
		<td>author</td><td><input type="text" name="author" value="${data.author }"></td>
		<td>작성일</td><td>${data.bwrite }</td>
	</tr>
	<tr>
		<td colspan="4" height="700px">
		<textarea rows="40px" cols="140px" name="content">${data.content }</textarea>
		</td>
	</tr>
</table>
<input type="submit"><a href="list">리스트로</a>
<input type="hidden" name="num" value="${data.num }">
</form>
</body>
</html>