<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/7 0007
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/account/addAccount" method="post">
        姓名：<input name="name"><br/>
        金额：<input name="money"><br/>
        日期：<input name="createTime" type="date"></br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
