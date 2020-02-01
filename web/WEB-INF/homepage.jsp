<%-- 
    Document   : homepage
    Created on : Feb 1, 2020, 12:59:35 PM
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
        <h1>Home Page</h1>
        <h2>Hello ${loggedInUserName}.</h2>
        <a href="login?logout">Log out</a>
    </body>
</html>
