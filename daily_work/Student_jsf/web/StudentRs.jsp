<%-- 
    Document   : StudentRs
    Created on : Dec 15, 2018, 11:17:44 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <s:view>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>studentRs Page</title>
    </head>
    <body>
        <h1>Hello students!</h1>
        <p> student : <h:outputText value="#{studentCon.stu.name}"></h:outputText></p>
     </body>
    </s:view>
</html>
