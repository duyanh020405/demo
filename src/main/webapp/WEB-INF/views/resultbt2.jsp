<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    if(email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()){
%>
<b style="color: red">Lỗi: vui lòng nhập lại email và password! - ${mess}</b>
<%
} else {
%>
<b>Email: <%= email %> , Password: <%= password %></b>
<%
    }
%>
</body>
</html>
