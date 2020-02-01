<%-- 
    Document   : login
    Created on : Feb 1, 2020, 12:59:24 PM
    Author     : 810783
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CPRG352 Lab4</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post">
            Username: <input type="text" name="userNameInput" required /><br>
            Password: <input type="password" name="passwordInput" required /><br>
            <input type="submit" value="Log in" />
            <p>${resultMessage}</p>
        </form>
    </body>
</html>
