<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function SaveProduct(){
  document.forms[0].action="saveProduct"
  document.forms[0].submit();
}
function UpdateProduct(){
	  document.forms[0].action="updateProduct"
	  document.forms[0].submit();
	}
function DeleteProduct(){
	  document.forms[0].action="deleteProduct"
	  document.forms[0].submit();
	}
</script>
<body>
<form>
<h2>Hello I'm in index page!</h2>
<h3>ProductId::<input type="text" name="productId"  value="${getIdObj.productId}"><br></h3>
<h3>ProductName::<input type="text" name="productName" value="${getIdObj.productName}"><br></h3>
<h3>Description::<input type="text" name="desription" value="${getIdObj.desription}"><br></h3>
<h3>Price::<input type="text" name="price" value="${getIdObj.price}"><br></h3>
<input type="button" value="Save" onclick="SaveProduct()">
<input type="button" value="Update" onclick="UpdateProduct()">
<input type="button" value="Delete" onclick="DeleteProduct()"> 
 <h2> <a href="getAll">GETALL</a></h2><br>
</form>
</body>
</html>