<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script scr="resources/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//jquert code
	})
</script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<c:if test="${result == 1}">
	<h1>정상 회원정보수정 완료</h1>
</c:if>

<a href="membermybatislist"> 회원리스트보러가기 </a>

</body>
</html>


