<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<h2>Login</h2>
<% if (request.getParameter("error") != null && request.getParameter("error").equals("true")) { %>
<p style="color: red;">Invalid username or password!</p>
<% } %>
<form action="login" method="Get">
    Username: <input type="text" name="username"><br><br><br>
    Password: <input type="password" name="password"><br><br><br>
    <input type="submit" value="Login">
</form>
</body>
</html>
