<%-- 
    Document   : Consulta
    Created on : 8/10/2018, 08:15:48 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONSULTA</title>
    </head>
    <body>
        
    <center>
        <h1>Consulta</h1>
        <form method="post" action="../ConsultaServlet">
            
            Escriba el nombre del alumno a buscar: <input type="text" name="buscanombre">
            <br><br>
            <input type="submit" value="Buscar">
            
        </form>
        
        </center>
    </body>
</html>
