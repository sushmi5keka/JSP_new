<%-- 
    Document   : core_remove
    Created on : Dec 13, 2018, 9:48:29 AM
    Author     : User
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<c:if test="${param.expert != null}">
    <c:remove var="level" scope="session"/>
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <a href="/page_146/index.jsp">index</a>
        <br>
        Your level is <c:out value="${level}" default="Expert"/>
        <c:choose>
            
            <c:when test="${level != null}">
                <p/>Here are the things you need to do...
            </c:when>
                
                <c:otherwise>
                    <p/> You'r The expert,you figure it out...
                </c:otherwise>
                    
        </c:choose>
   </body>
</html>
