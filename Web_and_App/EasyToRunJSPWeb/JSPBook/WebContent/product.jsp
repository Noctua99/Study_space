<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 상세 정보</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 정보</h1>
		</div>
	</div>
	<%
	String id = request.getParameter("id");
	ProductRepository dao = ProductRepository.getInstance();
	Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p>
					<b>상품 코드 : </b><span class="badge badge-danger"> <%=product.getProductId()%></span>
				<p>
					<b>제조사</b> : <span class="badge badge-danger"> <%=product.getManufacturer()%></span>
				<p>
					<b>분류</b> : <span class="badge badge-danger"> <%=product.getCategory()%></span>
				<p>
					<b>재고 수 </b>: <span class="badge badge-danger"> <%=product.getUnitPrice()%></span>
				<h4><%=product.getUnitPrice()%>원
				</h4>
				<p>
					<a href="#" class="btn btn-info"> 상품 주문 &raquo;</a> <a
						href="./products.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
