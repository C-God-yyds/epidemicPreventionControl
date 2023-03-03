<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/27
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--session是jsp的九大内置对象之一，可以直接在jsp中使用--%>
<%--session的作用域是作用于整个绘画--%>
    您成功了！！！欢迎<a href="../index.html"><%=session.getAttribute("data1")%></a>
</body>
</html>
