<%-- 
    Document   : login
    Created on : Jan 7, 2019, 10:39:12 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
        <h1>Please login</h1>
        
        <form action="loginAuthenticate.jsp">
            User Name :
            <input type="text" name="username"/><br/><br/>
            Password :
            <input type="password" name="password"/><br/><br/>
            <input type="submit" value="Login"/><br/><br/>
        </form>
        
        <font color="red">
        <c:if test="${not empty param.errorMsg}">
            <c:out value="${param.errorMsg}"/>
        </c:if>
        </font>
    </body>
</html>
