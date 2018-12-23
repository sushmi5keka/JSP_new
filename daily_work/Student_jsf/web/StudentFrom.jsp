<%-- 
    Document   : StudentFrom
    Created on : Dec 15, 2018, 11:04:34 AM
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
            <title>studentForm Page</title>
        </head>
        <body>
            <h:form>
                <h:inputText value="#{studentCon.stu.name}" size="35"/>
                <h:commandButton action="submit" value="sub"/>
            </h:form>
        </body>
    </s:view>

</html>
