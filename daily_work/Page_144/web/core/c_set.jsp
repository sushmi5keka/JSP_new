<%-- 
    Document   : c_set
    Created on : Dec 12, 2018, 12:38:00 PM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="browser" value="${header['User-Agent']}" scope="session"/>
            Your Browser User Agent is : <c:out value="${browser}" />
            <br>
            <a href="/Page_144/index.jsp">index</a>
            
    </body>
</html>
