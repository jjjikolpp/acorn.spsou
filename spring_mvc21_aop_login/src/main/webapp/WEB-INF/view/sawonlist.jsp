<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
* * 직원자료 * *<p/>
<table border="1">
  <tr>    
    <td>사번</td><td>직원명</td><td>직급</td><td>부서명</td>    
  </tr>
  <c:forEach var="s" items="${list }">
  <tr>
  	<td>${s.sawon_no }</td>
  	<td>${s.sawon_name }</td>
  	<td>${s.sawon_jik }</td>
  	<td>${s.buser_name }</td>
  </tr>
  </c:forEach>
</table>

</body>
</html>