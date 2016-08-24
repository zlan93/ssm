<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>ssm</title>
    <link rel="Shortcut Icon" href="<%=path%>/Content/custom/img/favicon.ico"/>
    <script src="<%=path%>/Content/custom/js/jquery1.4.js" type="text/javascript"></script>
    <script src="<%=path%>/Content/custom/js/ild.js" type="text/javascript"></script>
</head>
<body>
<h2>Hello World!11111</h2>
<form action="/ssm/home/login" method="post">
    <input type="text" id="userName" name="userName" value="tiantian">
    <input type="password" id="userPwd" name="userPwd" value="123456">
    <button type="submit">submit</button>
</form><br><br>
<hr/>
<br>
<a href="/ssm/home/update">正常的save</a>
<br><br>
<a href="/ssm/home/update1">错误，需要回滚的save</a>


<script type="text/javascript">
    $(document).ready(function (){

    });
</script>
</body>
</html>
