<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>USD to VND Converter</title>
</head>
<body>
<h1>USD to VND Converter</h1>
<form action="convert" method="post">
    <label for="exchangeRate">Exchange Rate:</label>
    <input type="number" name="exchangeRate" id="exchangeRate" required step="0.01">
    <br><br>
    <label for="usdAmount">USD Amount:</label>
    <input type="number" name="usdAmount" id="usdAmount" required step="0.01">
    <br><br>
    <input type="submit" value="Convert">
</form>
</body>
</html>
