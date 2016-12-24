<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="header.jsp" %>
	<h1 class="btn-danger text-center" style="padding:20px;">Access Denied!</h1>

	<c:choose>
		<c:when test="${empty username}">
			<h2>Log in</h2>
		</c:when>
		<c:otherwise>
			<h2>User: ${username} is not allowed to see this page!</h2>
		</c:otherwise>
	</c:choose>
<%@ include file="footer.jsp" %>
