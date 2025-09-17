<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Sandwich Result</title>
</head>
<body>
<h2>Bạn đã chọn các gia vị sau:</h2>
<c:if test="${not empty condiments}">
  <ul>
    <c:forEach items="${condiments}" var="c">
      <li>${c}</li>
    </c:forEach>
  </ul>
</c:if>

<c:if test="${not empty message}">
  <p style="color: red;">${message}</p>
</c:if>

<br>
<a href="sandwich">Quay lại</a>
</body>
</html>
