<%--
  Created by IntelliJ IDEA.
  User: XuanTho
  Date: 4/8/2020
  Time: 9:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>using JSP show content</title>
</head>
<body>
<h1>Discount calculator</h1>

<c:set scope="request" var="greeting" value="Hello every body" />
Greeting: <c:out value="${greeting}"/>
<%=request.getAttribute("price")%>
<%=request.getAttribute("percent")%>
<%=request.getAttribute("amount")%>
<%= request.getAttribute("discount")%>

</body>
</html>
