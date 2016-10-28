<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
**고객 출력 **<p>
${sawon_name } 의 관리고객<p>
<table>
<tr>
	<th>고객번호</th><th>고객명</th><th>성별</th><th>나이</th><th>전화</th>
</tr>
<c:forEach var="s" items="${gogek_list }" varStatus="list">
<tr>
	<td>${s.gogek_no }</td>
	<td>${s.gogek_name }</td>
	<td>${s.gogek_gen }</td>
	<td>${s.gogek_age }</td>
	<td>${s.gogek_tel }</td>
</tr>
</c:forEach>
</table>
인원수 : ${fn:length(gogek_list) }
</body>
</html>