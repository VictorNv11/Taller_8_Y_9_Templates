<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <title>Taller 1 </title>
</head>
<body>

<%@include file="includes/header.jsp"%>
<br>
<h1 style="text-align: center"><%= "Registrar usuario" %> </h1>
<br>
  <form class="container" action="registerUser" method="post" >


    <div class="mb-3">
      <label  class="form-label">Nombres</label>
      <input type="nombre" name="user_firstname" required class="form-control">
    </div>


    <div class="mb-3">
      <label class="form-label">Apellidos</label>
      <input type="text" name="user_lastname" required class="form-control">
    </div>


    <div class="mb-3">
      <label  class="form-label">Correo</label>
      <input type="email" name="user_email" required class="form-control">
    </div>


    <div class="mb-3">
      <label  class="form-label">Password</label>
      <input type="password" name="user_password" required class="form-control">
    </div>

    <button type="submit" class="btn btn-primary">Enviar</button>
  </form>
  <%@include file="includes/footer.jsp"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>

