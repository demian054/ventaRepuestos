<%-- 
    Document   : consulta_inventario
    Created on : 18/11/2013, 07:50:08 PM
    Author     : demian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <title>${mensaje}</title>
    </head>
    <body>
        holaaa
        <h1>${mensaje}</h1>
        holaaa
        <c:forEach items="${Inventarios}" var="consulta_inventarios">
            <c:out value="${consulta_inventarios.id}"></c:out><br>
            <c:out value="${consulta_inventarios._name}"></c:out><br>
        </c:forEach>
    </body>
</html>
