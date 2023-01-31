<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main</title>
    <base href="/">
</head>
<body>
<h2>Hello WebApp</h2>
<form action="/insert" method="post">
    <div>
        <input type="text" id="title" name="title">
        <input type="text" id="textLine" name="textLine">
        <button type="submit">등록</button>
    </div>
</form>
</body>
</html>