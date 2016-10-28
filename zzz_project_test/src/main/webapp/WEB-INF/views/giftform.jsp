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
	$("#fetch").click(function(){
		var web_link = $("#web_link").val();
		
	});
});
</script>
</head>
<body>
<table border="1">
	<tr><td>web link </td><td><input type="text" id="web_link">
	</td></tr>
	<tr><td colspan="2"><input type="button" id="fetch" value="fetch">
	</td></tr>
	<tr><td>gift name </td><td><input type="text" name="gift_name">
	</td></tr>
	<tr><td>price </td><td><input type="text" name="price">
	</td></tr>
	<tr><td>detail </td><td><textarea rows="10" cols="30"></textarea>
	</td></tr>
	<tr><td>image </td><td><input type="text" name="image">
	</td></tr>
</table>
</body>
</html>