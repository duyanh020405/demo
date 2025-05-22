<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DUY ANH
  Date: 19/05/2025
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form method="post" modelAttribute="login" action="/resultbt2">
        <form:input path="email"/>
        <form:errors path="email" cssClass="result-highlight"/>
        <br>
        <form:input path="password"/>
        <form:errors path="password" cssClass="result-highlight"/>
        <button type="submit">Add</button>
    </form:form>

</body>
</html>
