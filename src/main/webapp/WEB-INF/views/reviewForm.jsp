<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Đánh giá sản phẩm</title>
</head>
<body>

<h2>Form đánh giá sản phẩm</h2>

<form:form method="post" modelAttribute="review">

    <p>
        Tên:<br/>
        <form:input path="name" />
        <form:errors path="name" cssClass="error" />
    </p>

    <p>
        Email:<br/>
        <form:input path="email" />
        <form:errors path="email" cssClass="error" />
    </p>

    <p>
        Đánh giá (1-5 sao):<br/>
        <form:input path="rating" type="number" min="1" max="5" />
        <form:errors path="rating" cssClass="error" />
    </p>

    <p>
        Bình luận:<br/>
        <form:textarea path="comment" rows="4" cols="40" />
        <form:errors path="comment" cssClass="error" />
    </p>

    <p>
        <button type="submit">Gửi đánh giá</button>
    </p>
</form:form>

<c:if test="${not empty message}">
    <p style="color:green">${message}</p>
</c:if>

<style>
    .error {
        color: red;
    }
</style>

</body>
</html>
