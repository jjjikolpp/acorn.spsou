<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	직원 자료 ( Web Mvc + MyBatis) - 부서별 (asc) 이름별 (asc)
	<table border="1">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>부서명</th>
			<th>직급</th>
			<th>입사시기</th>
		</tr>
		<c:forEach var="s" items="${data }">
			<tr>
				<td>${s.sawon_no}</td>
				<td>${s.sawon_name}</td>
				<td>${s.buser_name}</td>
				<td>${s.sawon_jik}</td>
				<td>${s.sawon_ibsail}</td>
			</tr>
		</c:forEach>
	</table>
	인원수 : ${fn:length(data)}<p> 부서별 자료 보기 :
	<select name="buser">
		<option value="all">전체</option>
		<option value="chong">총무부</option>
		<option value="yong">영업부</option>
		<option value="jun">전산부</option>
		<option value="gan">관리부</option>
		<option value="gi">기타</option>
	</select>
	
</body>
</html>