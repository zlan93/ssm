<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>ssm</title>
    <link href="/Content/plugin/datetimepicker/css/bootstrap-datetimepicker.min.css"/>
    <script src="<%=path%>/Content/custom/js/jquery-2.1.4.min.js" type="text/javascript"></script>
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

<script type="text/javascript" src="<%=path%>/Content/plugin/datetimepicker/js/bootstrap-datetimepicker.min.js"/>
<script type="text/javascript">
    $(document).ready(function (){
        
    });

</script>
<%--<a href="/ssm/home/update">正常的save</a>
<button id="btn1">正常的save</button>
<br><br>
<a href="/ssm/home/update1">错误，需要回滚的save（验证事物回滚）</a>

<br><br>
<div id="mes"></div>
<script type="text/javascript">
    $(document).ready(function (){
         $('#btn1').bind('click',function (){
             $.ajax({
                 url:'<%=path%>/ssm/home/update',
                 type:'POST',
                 data:[],
                 dataType:'json',
                 success:function(data) {
                     if(data.res){
                         $('#mes').empty().append("正常的save: "+data.res);
                     }
                 }//end success
             });//end ajax
         });//end bind
    });
</script>--%>
</body>
</html>
