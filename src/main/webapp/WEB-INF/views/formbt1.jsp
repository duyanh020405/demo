<%--
  Created by IntelliJ IDEA.
  User: DUY ANH
  Date: 19/05/2025
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="formLogin" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="resultbt1" method="post" modelAttribute="user">
    <b>Name</b>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/><br>

    <b>Email</b>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/><br>

    <b>Phone</b>
    <form:input path="phone"/><br>

    <b>Password</b>
    <form:input path="password"/>
    <form:errors path="password" cssClass="error"/><br>

    <b>Status</b><br>
    <b>True</b> <form:radiobutton path="status" value="true"/>
    <b>False</b> <form:radiobutton path="status" value="false"/><br>

    <button type="submit">Add</button>
</form:form>


</body>
</html>
