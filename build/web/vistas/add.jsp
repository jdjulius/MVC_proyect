<%-- 
    Document   : add
    Created on : 23/01/2020, 09:26:00 AM
    Author     : ine-1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ADD</h1>
        <form id="datos" action="controlador">
            <div class="form-group">
                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" name="nombre">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" name="correo" aria-describedby="emailHelp">
            </div>                
            <button type="submit" class="btn btn-primary" name="accion" value="Agregar">Ingresar</button>
           

        </form>
    </body>
</html>
