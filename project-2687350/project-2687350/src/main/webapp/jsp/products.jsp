<%--
  Created by IntelliJ IDEA.
  User: JAVA AVZD
  Date: 30/05/2023
  Time: 4:28 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset= "uft-8">
  <meta name="author" content="Victor Rodriguez">
  <meta name="description" content="Inicio de sesion">
  <meta name="keywords" content=" HTML, CSS, JAVA">
  <meta name=" viewport" content="width=decive=width, initial-scale1">
  <title> Productos</title>
  <link rel="icon" type="image/x-icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxeOvb3x7F200Oo-68AL6eTJl9VlNqikXTuw&usqp=CAU">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

  <link rel="stylesheet"
        href="https://cdn.jsdelivr .net/npm/bootstrap-iconse1 .10.3/font/bootstrap-icons.css">


  <link rel="stylesheet" href="../css/stylesheet.css ">
</head>
<body class="text-center">

<%@include file="../includes/header.jsp"%>

<br>
<br>
<section class="form-signin w-50 m-auto" style="border: 1px solid darkgrey; background: darkgrey;">

  <form action="prductos" method="post" >
    <img class="mb-4" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSxeOvb3x7F200Oo-68AL6eTJl9VlNqikXTuw&usqp=CAU" alt="My login" width="100">
    <h1 class="h2 mb-3 fw-normal">Productos</h1>
    <h5 class="text-secondary">Ingrese los productos</h5>

    <div class="form-floating mb-3">
      <input type="text" class="form-control" id="products" name="product_name" placeholder="Ingrese el nombre del producto" required autofocus pattern="[A-Za-z0-9]{8, 12}" style="width: 50%; margin-left:25%">
      <label for="products"  style="margin-left:25%" >Productos:</label>
    </div>

    <div class="form-floating mb-3">
      <input type="number" class="form-control" id="Valor" name="product_value" placeholder="Ingrese el valor del producto " pattern="{12, 20} "required style="width: 50%; margin-left:25%">
      <label for="Valor" style="margin-left:25%">Valor:</label>
    </div>

    <div class="form-floating mb-3">
      <input type="text" class="form-control" id="category" name="category_id" placeholder="Ingrese la categoria" pattern="{12, 20} "required style="width: 50%; margin-left:25%">
      <label for="category" style="margin-left:25%">Categoria:</label>
    </div>

    <button type="submit" class="btn btn-primary">Ingresar</button>
    <div id="register">
      <a href="#"Registrarse></a>
    </div>


    </div>


  </form>

</body>




<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
