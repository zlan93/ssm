<%--
  Created by IntelliJ IDEA.
  User: lan
  Date: 2016/7/15
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
    <meta >
</head>
<body>
<h1>login error </h1>
<h2><%=request.getAttribute("res")%></h2>
<h2><%=request.getAttribute("mes")%></h2>
</body>
</html>
