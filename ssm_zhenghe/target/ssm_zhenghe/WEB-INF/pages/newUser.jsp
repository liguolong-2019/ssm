<%--
  Created by IntelliJ IDEA.
  User: ASUS_FX86
  Date: 2020/2/25
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加新用户</title>

    <style>
        .layout {
            width: 900px;
            height: 700px;
            border: cornflowerblue;
            background-color: aquamarine;
            margin:auto;
            padding: 15px;
        }
        .layout_left{
            wedth:100px;
            height: 45px;
            text-align: right;
            margin: auto;

        }

    </style>
</head>
<body>
<div class="layout">
<form action="saveUser">
    <table>
        <tr>
            <td class="layout_left"><label for="name">姓名</label></td>
            <td class="layout_right"><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="nation">民族</label></td>
            <td class="layout_right"><input type="text" name="nation" id="nation"></td>
        </tr>
        <tr>
        <td class="layout_left"><label for="birthday">出生年月</label></td>
        <td class="layout_right"><input type="text" name="birthday" id="birthday"></td>
        </tr>
        <tr>
        <td class="layout_left"><label for="height">身高</label></td>
        <td class="layout_right"><input type="text" name="height" id="height"></td>
        </tr>
        <tr>
        <td class="layout_left"><label for="phone">电话</label></td>
        <td class="layout_right"><input type="text" name="phone" id="phone"></td>
        </tr>
        <tr>
        <td class="layout_left"><label for="school">毕业院校</label></td>
        <td class="layout_right"><input type="text" name="school" id="school"></td>
        </tr>
        <tr>
        <td class="layout_left"><label for="mail">邮箱</label></td>
        <td class="layout_right"><input type="text" name="mail" id="mail"></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="degree">学历</label></td>
            <td class="layout_right"><input type="text" name="degree" id="degree"></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="education">教育背景</label></td>
            <td class="layout_right"><textarea name="education" id="education"></textarea></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="workthing">工作经历</label></td>
            <td class="layout_right"><textarea name="workthing" id="workthing"></textarea></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="skill">软件技能</label></td>
            <td class="layout_right"><textarea name="skill" id="skill"></textarea></td>
        </tr>
        <tr>
            <td class="layout_left"><label for="self">自我评价</label></td>
            <td class="layout_right"><textarea name="self" id="self"></textarea></td>
        </tr>

    </table>
    <input type="submit" value="提交"><br>
</form>
</div>
</body>
</html>
