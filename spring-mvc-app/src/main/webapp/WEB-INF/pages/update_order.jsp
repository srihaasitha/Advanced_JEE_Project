<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<title>Update Order</title>
<style>
body{
    background-color: #000000;
	background-image: linear-gradient(147deg, #000000 0%, #434343 65%);
	background-attachment: fixed;
	color:#ffffff;
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
  background-color: #fff;
  color: #000;
  transition: transform 0.2s cubic-bezier(0.235, 0, 0.05, 0.95);
}
  
.order:hover {
  transform: perspective(1px) scale3d(1.044, 1.044, 1) translateZ(0) !important;
}
</style>
</head>
<body class="d-flex flex-column align-items-center">
<div class="head">
  <h1>Update Order</h1>
</div>
<form action="update_order" method="post" style="background-color:white;color:black" class="form w-25 border p-2 rounded">
   
   <div Class="form-group">
   <label for="id">order Id:</label>
   <input required type="text" name="id" id="id" Class="form-control"/>
   </div>
   
   <div Class="form-group">
   <label for="customerName">customer Name</label>
   <input required type="text" name="customerName" id="customerName" Class="form-control"/>
   </div>
   
    <div Class="form-group">
   <label for="productId">product Id</label>
   <input required type="text" name="productId" id="productId" Class="form-control"/>
   </div>
   
    <div Class="form-group">
   <label for="quantity">quantity</label>
   <input required type="text" name="quantity" id="quantity" Class="form-control"/>
   </div>
   
   <div Class="form-group">
   <label for="orderDate">Order Date</label>
   <input required type="date" name="orderDate" id="orderDate" Class="form-control"/>
   </div>
   <br>
    <div Class="form-group d-flex justify-content-center">
  <input type="submit" value="UPDATE" name="oper" class="btn btn-dark w-50" />
   </div>
   </form>
   <br>
   <p style="color:#ffffff">${updated}</p>
   <br>
   <a style="color:white" href="product_list" target="_blank">View Available Products</a>
   <br>
   <a class="product order" href="orders">Back to Orders</a>
   <br>
</body>
</html>