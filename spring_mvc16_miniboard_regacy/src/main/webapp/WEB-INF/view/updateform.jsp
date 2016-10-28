<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
** 글 변경 **
<form action="update?num=${dto.num }" method="post">
<table>
	<tr>
		<td>글번호</td><td>${dto.num }</td>
	</tr>
	<tr>
		<td>작성자</td><td>
		<input type="text" name="author" value="${dto.author }">
		</td>
	</tr>
	<tr>
		<td>제목</td><td>
		<input type="text" name="title" value="${dto.title }">
		</td>
	</tr>
	<tr>
		<td>내용</td><td>
		<textarea rows="30" cols="30" name="content">${dto.content }</textarea>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="수정">
			<a href="list">취소</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>