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
			<h3>제품 등록</h3>
		</div>

		<form method="post">
			<div class="form-group">
				<label>제품명:</label> <input name="name" type="text" class="form-control">
			</div>
			<div>
				<label>가격:</label> <input name="price" type="number" class="form-control">
			</div>
			<div>
				<label>구분:</label> 
				<select name="category" class="form-select">
					<option value="1">음료</option>
					<option value="2">푸드</option>
					<option value="3">상품</option>
					<option value="4">카드</option>
				</select>
			</div>
			<div>
				<label>판매여부:</label>
				<select name="status" class="form-select">
					<option value="0">판매중지</option>
					<option value="1">판매중</option>
				</select>
			</div>
			<div class="form-group">
				<button class="btn btn-success">등록</button>
				<a href="list" class="btn btn-danger">취소</a>
			</div>
		</form>
	</div>
</body>
</html>