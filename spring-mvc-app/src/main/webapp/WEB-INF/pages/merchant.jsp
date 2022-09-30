<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<title>Find By Merchant</title>
<style>
body{
    background-color: #000000;
	background-image: linear-gradient(147deg, #000000 0%, #434343 65%);
	background-attachment: fixed;
	color:#ffffff;
	text-align:center;
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
h4 {
  text-align:center; font-size:40px; text-transform:uppercase; text-shadow: 2px 2px #bfbfbf ;color:#bfbfbf; letter-spacing:1px;
  font-family:"Playfair Display", serif; font-weight:400;
}
</style>
<title>Insert title here</title>
</head>
<body>
<h4>Enter Merchant Name</h4>
<br>
<br>
<center>
<form action="" method="post" style="background-color:white;color:black" class="form w-25 border p-2 rounded">
   
   <div Class="form-group">
   <label for="merchant">Merchant</label>
   <input required type="text" name="merchant" id="merchant">
   </div>
   <br>
    <div Class="form-group d-flex justify-content-center">
    <input type="submit" value="Find" name="oper" class="btn btn-dark w-50" />  
   </div>
   </form>
   <br>
   <br>
   <a class="product order btn w-5" href="products">Back to Products</a></center>
</center>
</body>
</html>