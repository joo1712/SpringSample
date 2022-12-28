<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Title</title>
<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
</head>
<body>
<!-- <h1>로그아웃 페이지</h1> -->
<!-- <form action="/user/logout" method="post"> -->
<%-- 	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"> --%>
<!-- 	<button>로그아웃</button> -->
<!-- </form> -->

	<script type="text/javascript">
		$(document).ready(function(){
			var form = $('<form></form>');
			var field = $('<input></input>');
					
			
			form.attr("action", "/user/logout");
			form.attr("method", "post");
					
			field.attr("type", "hidden");
			field.attr("name", "${_csrf.parameterName}");
			field.attr("value","${_csrf.token}");
			
			form.append(field);
			
			$(form).appendTo('body').submit();
		});
	</script>
</body>
</html>