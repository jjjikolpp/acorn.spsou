<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#sawonView").click(function(){
		var gogek_no = $("#gogek_no").val();
		var gogek_name = $("#gogek_name").val();
		
		$.ajax({
			type:"post",
			url:"sawon",
			dataType:"json",
			data:{"gogek_no":gogek_no, "gogek_name": gogek_name},
			
			success:function(data2){
				$("#showData").empty();
				var str = "직원명 : " + data2["sawon_name"] +
				"  직급 : " + data2["sawon_jik"] +
				"  부서명 : " + data2["buser_name"] +
				"  부서 전화 : " + data2["buser_tel"] ;
				$("#showData").append(str);
				
			},
			error:function(){
				$("showData").text("에러 발생");
			}
		});
	});
});
</script>
</head>
<body>
** Json 처리 문제 1 **<br>
관리고객 찾기
고객번호 : 
<input type="text" id="gogek_no" name="gogek_no">
고객명 : 
<input type="text" id="gogek_name" name="gogek_name">
<input type="button" id="sawonView" value="확인">
<div id="showData">요기에 출력</div>
</body>
</html>
