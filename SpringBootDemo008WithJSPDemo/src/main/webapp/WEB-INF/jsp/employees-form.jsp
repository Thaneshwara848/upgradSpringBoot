<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Add Employee</title>
    <style>
        body{font-family: Arial; margin:24px;}
        label{display:block; margin:10px 0 4px;}
        input{padding:8px; width:320px;}
        .row{margin-bottom:10px;}
        .btn{padding:8px 12px; border:1px solid #333; background:#fafafa; cursor:pointer;}
    </style>
</head>
<body>
<h2>Add Employee</h2>

<form method="post" action="${pageContext.request.contextPath}/employees">
    <!-- id is auto-generated; omit or keep hidden if you want to edit later -->
    <div class="row">
        <label>Name</label>
        <input type="text" name="name" required />
    </div>
    <div class="row">
        <label>Age</label>
        <input type="number" name="age" required />
    </div>
    <div class="row">
        <label>Salary</label>
        <input type="number" step="0.01" name="salary" required />
    </div>
    <div class="row">
        <label>Designation</label>
        <input type="text" name="desig" required />
    </div>
    <button class="btn" type="submit">Save</button>
    <a class="btn" href="${pageContext.request.contextPath}/employees">Cancel</a>
</form>

</body>
</html>
