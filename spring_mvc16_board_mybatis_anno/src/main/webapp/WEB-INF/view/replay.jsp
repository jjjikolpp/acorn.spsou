<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
**${bean.num }의 댓글달기 **
<form action="replay?num=${bean.num }&gnum=${bean.gnum }&onum=${bean.onum}&nested=${bean.nested}" method="post">
<table border="1">
	<tr><td>작성자</td><td><input type="text" name="author"></td></tr>
	<tr><td>제목</td><td><input type="text" name="title"></td></tr>
	<tr>
	<td colspan="2"><textarea rows="40px" cols="40px" name="content"></textarea>
	</td>
	</tr>
	<tr><td colspan="2">
		<input type="submit" value="글쓰기"><a href="list">취소</a>
	</td>
	</tr>
</table>
</form>
</body>
</html>