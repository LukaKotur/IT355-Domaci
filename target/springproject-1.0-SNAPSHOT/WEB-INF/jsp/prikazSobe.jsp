<%-- 
    Document   : prikazSobe
    Created on : 12-Dec-2016, 14:27:42
    Author     : Luka
--%>

<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page session="true"%>
<%@ include file="header.jsp" %>

        <h2>Podaci o unetoj sobi</h2>
        <table class="table">
            <tr>
                <td><spring:message code="numberOfBeds"/></td>
                <td>${beds}</td>
            </tr>
            <tr>
                <td><spring:message code="size"/></td>
                <td>${size} m<sup>2</sup></td>
            </tr>
            <tr>
                <td><spring:message code="tv"/></td>
                <td>${tv}</td>
            </tr>
            <tr>
                <td><spring:message code="ac"/></td>
                <td>${ac}</td>
            </tr>
            <tr>
                <td><spring:message code="bathroom"/></td>
                <td>${bathroom}</td>
            </tr>
            <tr>
                <td><spring:message code="pricePerDay"/></td>
                <td>${price} &euro;</td>
            </tr>
        </table>

<%@ include file="footer.jsp" %>
