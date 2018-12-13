<%-- 
    Document   : core_if
    Created on : Dec 13, 2018, 10:42:23 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.apress.projsp.CalendarBean" %>
<jsp:useBean id="cal" class="com.apress.projsp.CalendarBean"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        The time is currently : <br><br>
        
        <c:out value="${cal.time}"/>
        
        <c:set var="hour" value="${cal.hour}" scope="request"/>
        
        <b>
            
            <c:if test="${hour > 0 && hour <= 11}">
                good morning !!!
            </c:if>   
            
                <c:if test="${hour > 12 && hour <= 17}">
                good afternoon !!!
            </c:if> 
                
                <c:if test="${hour > 18 && hour <= 20}">
                good evening !!!
            </c:if> 
                
                <c:if test="${hour > 21 && hour <= 23}">
                good night !!!
            </c:if> 
                
        </b>
        
         <a href="/page_146/index.jsp">index</a>
        
    </body>
</html>
