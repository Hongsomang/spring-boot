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
			<h3>고객정보 변경</h3>
		</div>

		<form action="" method="post">
			<div class="form-group">
				<label>고객명:</label> <input name="name" type="text" value="${item.name}" class="form-control">
			</div>
			<div>
				<label>전화번호:</label> <input name="tel" type="text" value="${item.tel}" class="form-control">
			</div>
			<div>
				<label>포인트:</label> <input name="point" type="number" value="${item.point}" class="form-control">
			</div>
			
			<div>
				<button class="btn btn-success">변경</button>
				<a href="../list" class="btn btn-danger">취소</a>
			</div>
		</form>
	</div>
</body>
</html>