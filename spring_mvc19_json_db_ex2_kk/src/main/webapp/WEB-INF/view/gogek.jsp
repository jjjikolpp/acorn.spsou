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
	
	$("#kkk").click(function(){
		$("#showshowshow").empty();
		$.ajax({
			type:"get",
			url:"json",
			dataType:"json",
			data:{"buser_name": $("#buser_name").val()},
			success:function(data){
				var str = "<table border='1' style='text-align: center;'>"
					str += "<tr><th>사번</th><th>직원명</th><th>부서전화</th><th>직급</th><th>관리고객</th></tr>";
					var list = data.datas;
					$(list).each(function(index, objArr){
						str += "<tr>";
						str += "<td>" + objArr["sawon_no"] +"</td>";
						if(objArr["gogeksu"] >0){
							str += "<td><a href='#'" + " onclick = funcGogek('" + objArr["sawon_name"] + "')>" + objArr["sawon_name"] +"</a></td>";
						}else{
							str += "<td>" + objArr["sawon_name"] +"</td>";
						}
						str += "<td>" + objArr["buser_tel"] +"</td>";
						str += "<td>" + objArr["sawon_jik"] +"</td>";
						str += "<td>" + objArr["gogeksu"] +"</td>";
						str += "</tr>";
					});
					str+= "</table>";
					$("#showshowshow").append(str);
			},
			error:function(){
				$("#showshowshow").html("에런뎅");
			}
		});
	});
});

function funcGogek(kkk){
	//alert(a);
	$("#hahahoho").empty();
	$.ajax({
		type:"get",
		url:"json2",
		dataType:"json",
		data:{"sawon_name": kkk},
		success:function(data){
			var str = "<table border='1' style='text-align: center;'>"
				str += "<tr><th>고객번호</th><th>고객명</th><th>고객전화</th></tr>";
				var list = data.datas;
				var count = 0;
				$(list).each(function(index, objArr){
					count++;
					str += "<tr>";
					str += "<td>" + objArr["gogek_no"] +"</td>";
					str += "<td style='cursor: pointer;' class='hover"+ count +"' onmouseover=funcKK('"+count+"')>" + objArr["gogek_name"] +"<span id='view"+ count +"' style='display: none;'>" +objArr["gogek_jumin"]+"</span></td>";
					str += "<td>" + objArr["gogek_tel"] +"</td>";
					str += "</tr>";
				});
				str+= "</table>";
				str+= "고객수:" + count;
				$("#hahahoho").append(str);
		},
		error:function(){
			$("#hahahoho").html("에런뎅");
		}
	});
}
function funcKK(a){
	$(".hover" + a).hover(
		function(){
			$("#view" + a).show();
		},
		function(){
			$("#view" + a).hide();
		}
	);
}
</script>
</head>
<body>
부서명 : <input type="text" name="buser_name" id="buser_name"><br/>
<input type="button" id="kkk" value="확인"><br/>
<hr>
<div id="showshowshow"></div>

<hr>

<div id="hahahoho"></div>
</body>
</html>