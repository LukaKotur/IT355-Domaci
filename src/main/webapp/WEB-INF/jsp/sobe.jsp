<%-- 
    Document   : listaSoba
    Created on : 28-Dec-2016, 15:04:51
    Author     : Luka
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ include file="header.jsp" %>
<h1>Studenti:</h1>
<c:if test="${!empty sobe}">
    <table class="table table-bordered">
        <tr>
            <th> id</th>
            <th> Broj kreveta </th>
            <th> Klima</th>
            <th> TV</th>
            <th> Kupatilo</th>
            <th> Velicina</th>
            <th> Cena po danu</th>
            <th> Obrisi </th>
            <th> Edituj </th>
        </tr>
        <c:forEach items="${sobe}" var="soba">
            <tr>
                <td>${soba.sobaId}</td>
                <td>${soba.numberOfBeds}</td>
                <td>${soba.ac}</td>
                <td>${soba.tv}</td>
                <td>${soba.bathroom}</td>
                <td>${soba.size}</td>
                <td>${soba.pricePerDay}</td>
                <td>
                    <a href="<c:url value="/deleteSoba?sobaId=${soba.sobaId}"/>">Delete</a>
                </td>
                <td>
                    <a href="<c:url value="/editSoba?sobaId=${soba.sobaId}"/>">Edit</a>
                </td>
                     
                
                
            </tr>
        </c:forEach>
    </c:if>
</table>

<%@ include file="footer.jsp" %>
