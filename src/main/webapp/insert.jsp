<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Department Management</title>
</head>
<body>
<h1>Department Management</h1>

<div class="form-container">
    <h3>Add New Department</h3>
    <form action="addDep" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="location">Location:</label>
        <input type="text" id="location" name="location" required><br><br>

        <label for="hname">Head Name:</label>
        <input type="text" id="hname" name="hname" required><br><br>

        <button type="submit">Add Department</button>
    </form>
</div>
   

</body>
</html>
