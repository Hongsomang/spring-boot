<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

</head>
<body>
	
		<div>
			<c:if test="${list.size()<1 }">
				<h1>판매준비중 입니다.</h1>
				<li>${error} </li>
			</c:if>
			<c:forEach var="item" items="${list }">
				<li>${item.name} <a href="/order/${item.id}"><button>주문</button></a> </li>
			</c:forEach>
		</div>
</body>
</html>