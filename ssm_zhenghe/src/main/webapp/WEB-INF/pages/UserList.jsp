<%--
  Created by IntelliJ IDEA.
  User: ASUS_FX86
  Date: 2020/2/25
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>所有用户</title>
</head>
<body>
    <table border="1" width="500" align="center">
        <tr>
            <th>编号</th>
            <th>用户名</th>
        </tr>
       <c:forEach items="${list}" var="user" varStatus="s">
           <tr>
               <td>${s.count}</td>
               <td>${user.name}</td>
           </tr>
       </c:forEach>
    </table>
</body>
</html>
