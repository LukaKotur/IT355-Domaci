<%-- 
    Document   : addSoba
    Created on : 28-Dec-2016, 15:29:30
    Author     : Luka
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file = "header.jsp" %>

<div align="center">
    <h1>Forma za unos/izmenu sobe</h1>
    <form:form action="saveSoba" method="post" modelAttribute="soba">
        <form:hidden path="sobaId"/>
        <div class="form-group">
            <form:label path="numberOfBeds">Broj kreveta</form:label>
            <form:input  id="numberOfBeds" placeholder="Broj kreveta" path="numberOfBeds" />
        </div>
        <div class="form-group">
            <form:label path="ac">ac</form:label>
            <form:select  path="ac">
                <form:option value="da"> da</form:option>
                <form:option value="ne"> ne</form:option>
            </form:select>
        </div>
        <div class="form-group">
            <form:label path="tv">Tv</form:label>
            <form:select  path="tv">
                <form:option value="da"> da</form:option>
                <form:option value="ne"> ne</form:option>
            </form:select>
        </div>
        <div class="form-group">
            <form:label path="bathroom">Kupatilo</form:label>
            <form:select  path="bathroom">
                <form:option value="da"> da</form:option>
                <form:option value="ne"> ne</form:option>
            </form:select>
        </div>
        <div class="form-group">
            <form:label path="size">Velicina</form:label>
            <form:input  id="size" placeholder="Velicina" path="size" />
        </div>

        <div class="form-group">
            <form:label path="pricePerDay">Cena po danu</form:label>
            <form:input  id="pricePerDay" placeholder="Cena po danu" path="pricePerDay" />
        </div>
        <input type="submit" value="Save">
    </form:form>
</div>
<%@include file = "footer.jsp" %>


