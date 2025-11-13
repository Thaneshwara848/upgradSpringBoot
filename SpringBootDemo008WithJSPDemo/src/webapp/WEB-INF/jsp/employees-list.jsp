<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Employees</title>
    <style>
        body{font-family: Arial; margin:24px;}
        table{border-collapse:collapse; width:100%;}
        th,td{border:1px solid #ddd; padding:8px;}
        th{background:#f5f5f5; text-align:left;}
        a.btn{display:inline-block; padding:8px 12px; margin:8px 0; border:1px solid #333; text-decoration:none}
    </style>
</head>
<body>
<h2>Employees</h2>

<a class="btn" href="${pageContext.request.contextPath}/employees/new">+ Add Employee</a>

<table>
    <thead>
    <tr>
        <th>ID</th><th>Name</th><th>Age</th><th>Salary</th><th>Desig</th><th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="e" items="${emps}">
        <tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td>${e.salary}</td>
            <td>${e.desig}</td>
            <td>
                <a href="${pageContext.request.contextPath}/employees/${e.id}">View</a> |
                <a href="${pageContext.request.contextPath}/employees/delete/${e.id}"
                   onclick="return confirm('Delete?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
