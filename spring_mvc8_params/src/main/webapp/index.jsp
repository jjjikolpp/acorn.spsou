<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
	**요청 파라미터 ** <p/>
<a href="kbs/login?type=admin">관리자</a><br>
<a href="kbs/login?type=user">일반인</a><br>
<a href="kbs/login">인자 없음</a><br>

<form action="kbs/login" method="post">
data : <input type="text" name="type">
<input type="submit" value="전송1">
</form>

<form action="kbs/korea" method="post">
data : <input type="text" name="type">
<input type="submit" value="전송2">
</form>

<form action="kbs/asia" method="post">
data : <input type="text" name="type">
<input type="submit" value="전송3">
</form>

<form action="ent/yg/singer/2ne1" method="get">
신곡 : <input type="text" name="title">
<input type="submit" value="전송4">
</form>

<form action="ent/sm/singer/exo" method="get">
신곡 : <input type="text" name="title">
<input type="submit" value="전송5">
</form>

</body>
</html>
