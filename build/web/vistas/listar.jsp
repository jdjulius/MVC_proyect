<%-- 
    Document   : listar
    Created on : 23/01/2020, 09:26:23 AM
    Author     : ine-1
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <div>
            <h1>Personas</h1>
            <a href="controlador?accion=add">Agregar Nuevo</a>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Correo</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <%
                    ClienteDAO dao = new ClienteDAO();
                    List<Cliente> list = dao.listar();
                    Iterator<Cliente> inter = list.iterator();
                    Cliente cli = null;
                    while (inter.hasNext()) {
                        cli = inter.next();

                %>
                <tbody>
                    <tr>
                        <th><%= cli.getId()%></th>
                        <th><%= cli.getNombre()%></th>
                        <th><%= cli.getCorreo()%></th>
                        <th>
                            <a href="controlador?accion=editar&id=<%= cli.getId()%>">Editar</a>
                            <a>Eliminar</a>
                        </th>
                    </tr>
                    <%}%>
                </tbody>

            </table>

        </div>

    </body>
</html>
