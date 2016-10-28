<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#showData").empty();
	$.ajax({
		type:"get",
		url:"sangpum",
		dataType:"json",
		success:function(sangpumData){
			var str = "<table border='1'";
			str += "<tr><th>코드</th><th>sang</th><th>su</th><th>dan</th></tr>"
			var list = sangpumData.datas;
			$(list).each(function(index,objArr){
				str += "<tr>";
				str += "<td>"  + objArr["code"] + "</td>";
				str += "<td>"  + objArr["sang"] + "</td>";
				str += "<td>"  + objArr["su"] + "</td>";
				str += "<td>"  + objArr["dan"] + "</td>";
				str += "</tr>";
			});
			str += "</table>";
			$("#showData").append(str);
		},
		error:function(){
			$("#showData").text("에러 발생");
		}
	});
});
</script>
</head>
<body>
** 상품 자료 처리 결과 ( Spring, Ajax) ** <p>
<div id="showData">요기에 출력</div>
</body>
</html>