<%--
  Created by IntelliJ IDEA.
  User: DUY ANH
  Date: 23/05/2025
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head><title>Đăng ký</title></head>
<body>
<h2>Form Đăng ký</h2>
<form:form method="post" modelAttribute="user">
  <p>
    Tên: <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
  </p>

  <p>
    Số điện thoại:
    <form:input path="phone"/>
    <form:errors path="phone" cssClass="error"/>
  </p>

  <p><button type="submit">Đăng ký</button></p>
</form:form>

<c:if test="${not empty message}">
  <p style="color:green;">${message}</p>
</c:if>
</body>
</html>

