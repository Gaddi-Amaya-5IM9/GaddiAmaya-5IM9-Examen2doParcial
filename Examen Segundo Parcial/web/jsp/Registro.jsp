<%-- 
    Document   : Registro
    Created on : 8/10/2018, 08:15:11 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>   REGISTRO   </title>
    </head>
    <body>
        
    <center>
        <h1>Registro</h1>
        
        <form action="../RegistroServlet" method="post"> 
            
           
            Nombre: <input type="text" name="nombre"><br><br>
            Apellido Paterno: <input type="text" name="appat"><br><br>
            Apellido Materno: <input type="text" name="apmat"><br><br>
            Escuela: <input type="text" name="escuela"><br><br>
            Materia Favorita: <input type="text" name="matfav"><br><br>
            Deporte Favorito: <input type="text" name="depfav"><br><br>
            
            
            <input type="submit" value="Registrar">
            
        </form>
        </center>
        
    </body>
</html>
