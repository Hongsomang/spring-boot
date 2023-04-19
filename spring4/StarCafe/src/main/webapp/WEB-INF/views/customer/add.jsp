<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<jsp:include page="../header.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<div>
			<h3>고객 등록</h3>
		</div>

		<form method="post">
			<div class="form-group">
				<label>고객명:</label> <input name="name" type="text" class="form-control">
			</div>
			<div>
				<label>전화번호:</label> <input name="tel" type="text" class="form-control">
			</div>
			<div>
				<label>포인트:</label> <input name="point" type="number" class="form-control">
			</div>
			
			<div class="form-group">
				<button class="btn btn-success">등록</button>
				<a href="list" class="btn btn-danger">취소</a>
			</div>
		</form>
	</div>
</body>
</html>