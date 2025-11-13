<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Employee Details</title>
    <style>
        body{font-family: Arial; margin:24px;}
        .card{border:1px solid #ddd; padding:16px; max-width:420px;}
        .row{margin:6px 0;}
        .btn{display:inline-block; padding:8px 12px; margin-top:10px; border:1px solid #333; text-decoration:none}
    </style>
</head>
<body>
<h2>Employee Details</h2>

<c:choose>
    <c:when test="${emp != null}">
        <div class="card">
            <div class="row"><b>ID:</b> ${emp.id}</div>
            <div class="row"><b>Name:</b> ${emp.name}</div>
            <div class="row"><b>Age:</b> ${emp.age}</div>
            <div class="row"><b>Salary:</b> ${emp.salary}</div>
            <div class="row"><b>Designation:</b> ${emp.desig}</div>
        </div>
    </c:when>
    <c:otherwise>
        <p>No employee found.</p>
    </c:otherwise>
</c:choose>

<a class="btn" href="${pageContext.request.contextPath}/employees">Back to list</a>
</body>
</html>
