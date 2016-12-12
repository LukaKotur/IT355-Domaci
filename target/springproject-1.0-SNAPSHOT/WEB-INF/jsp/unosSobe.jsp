<%-- 
    Document   : unosSobe
    Created on : 12-Dec-2016, 14:33:39
    Author     : Luka
--%>


<!DOCTYPE html>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="header.jsp" %>

<h2>Unesite informacije o sobi koju zelite da unesete</h2>

<form:form method="POST" action="/springproject/addSoba" commandName="soba">
    <table class="table">
        <tr>
            <td><form:label path="numberOfBeds"><spring:message code="numberOfBeds"/>:</form:label></td>
            <td><form:input path="numberOfBeds" /></td>
        </tr>
        <tr>
            <td><form:label path="size"><spring:message code="size"/>(m<sup>2</sup>):</form:label></td>
            <td><form:input path="size" /></td>
        </tr>
        <tr>
            <td><form:label path="tv"><spring:message code="tv"/>:</form:label></td>
            <td><form:input path="tv" /></td>
        </tr>
        <tr>
            <td><form:label path="ac"><spring:message code="ac"/>:</form:label></td>
            <td><form:input path="ac" /></td>
        </tr>
        <tr>
            <td><form:label path="bathroom"><spring:message code="bathroom"/>:</form:label></td>
            <td><form:input path="bathroom" /></td>
        </tr>
        <tr>
            <td><form:label path="pricePerDay"><spring:message code="pricePerDay"/>:</form:label></td>
            <td><form:input path="pricePerDay" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" class="btn btn-success" value="Pošalji"/>
            </td>
        </tr>
    </table>
</form:form>

<%@ include file="footer.jsp" %>
