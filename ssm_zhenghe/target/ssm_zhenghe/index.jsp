<%--
  Created by IntelliJ IDEA.
  User: ASUS_FX86
  Date: 2020/2/8
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

    <style>
        .layout{
            width: 900px;
            height: 500px;
            border: crimson;
            background-color: cornsilk;
            margin: auto;

        }

    </style>
</head>
<body>
<div class="layout">
<a href="account/findAll"> 查看所有用户</a><br>
<a href="account/addUser">添加新用户</a><br>

<form action="account/creatPDF">
    输入已添加用户名下载对应简历:<input type="text" name="name"><br>
    <input type="submit" value="下载">
</form>

<form action="account/deleteUser" >
    输入需要删除的用户的用户名:<input type="text" name="name"><br>
    <input type="submit" value="删除">
</form>

</div>

</body>
</html>
