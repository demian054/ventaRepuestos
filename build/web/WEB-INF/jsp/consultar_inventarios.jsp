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
       
        <title>${Message}</title>
    </head>
    <body>
        <h1>${Message}</h1>
        <table border=1 style="border: 1px;">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>citas</th>
                <th>facturas</th>
                <th>createdBy</th>
                <th>createdAt</th>
                <th>updatedBy</th>
                <th>updatedAt</th>
                <th>deleted</th>
                <th>cantidad</th>
                
            </tr>
        <c:forEach items="${Inventarios}" var="consulta_inventarios">
            <tr>
                
                <td><c:out value="${consulta_inventarios.id}"></c:out></td>
                <td><c:out value="${consulta_inventarios.name}"></c:out></td>
                <td><c:out value="${consulta_inventarios.citas}"></c:out></td>
                <td><c:out value="${consulta_inventarios.articulos}"></c:out></td>
                <td><c:out value="${consulta_inventarios.facturas}"></c:out></td>
                <td><c:out value="${consulta_inventarios.createdBy}"></c:out></td>
                <td><c:out value="${consulta_inventarios.createdAt}"></c:out></td>
                <td><c:out value="${consulta_inventarios.updatedBy}"></c:out></td>
                <td><c:out value="${consulta_inventarios.updatedAt}"></c:out></td>
                <td><c:out value="${consulta_inventarios.deleted}"></c:out></td>
                <td><c:out value="${consulta_inventarios.cantidad}"></c:out></td>
        </c:forEach>
        </table>
    </body>
</html>
