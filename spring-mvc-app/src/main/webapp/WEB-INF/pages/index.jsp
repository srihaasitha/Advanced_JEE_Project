<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
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
body{
    background-color: #000000;
	background-image: linear-gradient(147deg, #000000 0%, #434343 74%);
	background-attachment: fixed;
}
.head h1 {
  text-align:center; font-size:50px; text-transform:uppercase; text-shadow: 2px 2px #ffffff ;color:#bfbfbf; letter-spacing:1px;
  font-family:"Playfair Display", serif; font-weight:400;
}
.head h1 span {
  margin-top: 5px;
    font-size:15px; color:#a6a6a6; word-spacing:1px; font-weight:normal; letter-spacing:2px;
    text-transform: uppercase; font-family:"Raleway", sans-serif; font-weight:500;

    display: grid;
    grid-template-columns: 1fr max-content 1fr;
    grid-template-rows: 27px 0;
    grid-gap: 20px;
    align-items: center;
    text-shadow: 0px 0px #ffffff ;
}

.head h1 span:after,.head h1 span:before {
    content: " ";
    display: block;
    border-bottom: 1px solid #ccc;
    border-top: 1px solid #ccc;
    height: 5px;
  background-color:#f8f8f8;
}
</style>
<meta charset="ISO-8859-1">
<title>E-Commerce Store</title>
</head>
<body>
<center>
<div class="head">
  <h1>E-Commerce Store<span>Every product is special</span></h1>
</div>
<br>
<br>
<font size="5">
<a class="product order" href="products">Products</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a class="product order" href="orders">&nbsp;&nbsp;Orders&nbsp;&nbsp;</a>
</center>
</font>

</body>
</html>