<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <title>Đăng ký người dùng</title>
</head>
<body>
<h2>Form Đăng Ký</h2>

<form:form method="post" modelAttribute="user">
    <p>
        Tên: <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>

    <p>
        Email: <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </p>

    <p>
        Vai trò:
        <form:select path="role">
            <form:option value="" label="-- Chọn vai trò --"/>
            <form:option value="user" label="Người dùng"/>
            <form:option value="admin" label="Quản trị viên"/>
        </form:select>
        <form:errors path="role" cssClass="error"/>
    </p>

    <p>
        Mã admin (chỉ dành cho admin):
        <form:input path="adminCode"/>
        <form:errors path="adminCode" cssClass="error"/>
    </p>

    <p><button type="submit">Đăng ký</button></p>
</form:form>

<c:if test="${not empty message}">
    <p style="color:green;">${message}</p>
</c:if>
</body>
</html>
