<%-- 
    Document   : header
    Created on : 12-Dec-2016, 16:56:12
    Author     : Luka
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="true"%>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<form action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden" name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>
<script>
    function formSubmit() {
        document.getElementById("logoutForm").submit();
    }
</script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.1.1.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Bootstrap JSP page</title>
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-default">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="<c:url value="/"/>">IT355-Domaci</a>
                    </div>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="<c:url value="/"/>">Home</a></li>
                            <li><a href="<c:url value="/addSoba"/>">Dodaj Sobu</a></li>
                            <li><a href="<c:url value="/sobe"/>">Lista Soba</a></li>
                            <li><a href="<c:url value="/exceptionSoba"/>">Throw Exception</a></li>  
                        </ul>
                        <ul class="nav navbar-nav navbar-right">
                            <c:if test="${pageContext.request.userPrincipal.name != null}">
                                <li><a href="#">Hello ${pageContext.request.userPrincipal.name}</a></li>  
                                <li><a href="javascript:formSubmit()"> Logout</a></li>
                                </c:if>
                                <c:if test="${pageContext.request.userPrincipal.name == null}">
                                <li><a href="<c:url value="/login"/>">Login</a></li>  
                                </c:if>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>

