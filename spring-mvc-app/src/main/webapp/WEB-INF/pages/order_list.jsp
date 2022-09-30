<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href=
"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
        integrity=
"sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">
<meta charset="ISO-8859-1">

<title>All Order Details</title>
<style>
h1 {
  text-align:center; font-size:40px; text-transform:uppercase; text-shadow: 2px 2px #bfbfbf ;color:#bfbfbf; letter-spacing:1px;
  font-family:"Playfair Display", serif; font-weight:400;
}
.product {
  display: inline-flex;
  align-items: center;
  justify-content: center;
  padding: 0.7rem 2rem;
  font-family: "Poppins", sans-serif;
  font-weight: 700;
  font-size: 18px;
  text-align: center;
  text-decoration: none;
  color: #fff;
  backface-visibility: hidden;
  border: 0.3rem solid transparent;
  border-radius: 3rem;
  
}

.order {
  border-color: transparent;
  color: #ffffff;
  transition: transform 0.2s cubic-bezier(0.235, 0, 0.05, 0.95);
  background-color:#000000;
}
  
.order:hover {
  transform: perspective(1px) scale3d(1.044, 1.044, 1) translateZ(0) !important;
}
</style>
</head>
<body class="p-3">
<center>


<h1 style="color:#000000">Orders Details</h1></center>
<table class="table table-striped table-dark">
	<thead>
		<tr>
			<th>Order ID</th>
			<th>Customer Name</th>
			<th>Product Id</th>
			<th>Order Date</th>
			<th>Quantity</th>
		</tr>
	</thead>
<tbody>
<c:forEach items="${list}" var="each">
<tr>
		<td>${each.orderId}</td>
		<td>${each.customerName}</td>
		<td>${each.productId.productId}</td>
		<td>${each.orderDate}</td>
		<td>${each.quantity}</td>
	</tr>
</c:forEach>
	
</tbody>
</table>
<br>
<br>
<a class="product order" href="orders">Back to Orders</a></center>
</body>
</html>