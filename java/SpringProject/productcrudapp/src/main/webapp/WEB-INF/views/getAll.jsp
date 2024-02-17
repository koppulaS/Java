<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>id</th>
<th>ProdctName</th>
<th>Description</th>
<th>price</th>
</tr>
 <c:if test="${not empty product}">
<c:forEach items="${product}" var="obj">
<tr>
<td>${obj.productId}</td>
<%-- <td><a href="getidobj.do?id=${obj.id}">${obj.name}</a></td> --%>
<td><a href="getById?productId=${obj.productId}">${obj.productName}</a></td>
<td>${obj.productName}</td>
<td>${obj.desription}</td>
<td>${obj.price}</td>
</c:forEach> 
 </c:if>
</table>
</body>
</html>