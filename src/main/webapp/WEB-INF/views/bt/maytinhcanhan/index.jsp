<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/17/2025
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h2 class="fw-bold">Calculator</h2>

    <form action="calculate" method="post" class="mt-3">
        <div class="row mb-3">
            <div class="col-md-3">
                <input type="number" step="any" name="num1" class="form-control"
                       placeholder="Enter number 1" value="${num1}" required>
            </div>
            <div class="col-md-3">
                <input type="number" step="any" name="num2" class="form-control"
                       placeholder="Enter number 2" value="${num2}" required>
            </div>
        </div>

        <div class="row g-2">
            <div class="col-md-3">
                <button type="submit" name="operation" value="add" class="btn btn-primary w-100">Addition(+)</button>
            </div>
            <div class="col-md-3">
                <button type="submit" name="operation" value="sub" class="btn btn-secondary w-100">Subtraction(-)</button>
            </div>
            <div class="col-md-3">
                <button type="submit" name="operation" value="mul" class="btn btn-success w-100">Multiplication(X)</button>
            </div>
            <div class="col-md-3">
                <button type="submit" name="operation" value="div" class="btn btn-danger w-100">Division(/)</button>
            </div>
        </div>
    </form>

    <!-- Hiển thị kết quả -->
    <c:if test="${not empty result}">
        <div class="mt-4 alert alert-info">
            <h4>Kết quả: ${num1} ${operation} ${num2} = <span class="text-success">${result}</span></h4>
        </div>
    </c:if>

    <!-- Hiển thị lỗi -->
    <c:if test="${not empty error}">
        <div class="mt-4 alert alert-danger">
                ${error}
        </div>
    </c:if>
</div>
</body>
</html>
