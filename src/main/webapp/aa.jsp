<%--
  Created by IntelliJ IDEA.
  User: cjm
  Date: 7/26/16
  Time: 7:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="god" uri="http://histr.com" %>

<%
    //response.getWriter().write(request.getAttribute("name").toString());
    //response.getWriter().write(request.getAttribute("age").toString());
%>

<html>
<head>
    <title></title>
</head>
<body>
    <c:out value="${name}"></c:out>
    <hr/>
    ${name} ${age}
    <hr/>
    <god:myTag></god:myTag>
</body>
</html>
