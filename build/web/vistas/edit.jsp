<%-- 
    Document   : newjspedit
    Created on : 23/01/2020, 09:26:06 AM
    Author     : ine-1
--%>

<%@page import="modelo.Cliente"%>
<%@page import="modeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ClienteDAO dao = new ClienteDAO();
            int id = Integer.parseInt((String)request.getAttribute("idcli"));
            Cliente c = (Cliente) dao.list(id);
            
        %>
        <h1>ADD</h1>
        <form id="datos" action="controlador">
            <div class="form-group">
                <input type="hidden" class="form-control" name="txtid" value="<%= c.getId()%>">

                <label for="nombre">Nombre</label>
                <input type="text" class="form-control" name="nombre" value="<%= c.getNombre() %>">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" name="correo" aria-describedby="emailHelp" value="<%= c.getCorreo()%>">
            </div>                
            <button type="submit" class="btn btn-primary" name="accion" value="Actualizar">Ingresar</button>


        </form>
    </body>
</html>
