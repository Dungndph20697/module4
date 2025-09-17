<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Sandwich Condiments</title>
</head>
<body>
<h2>Sandwich Condiments</h2>
<form action="saveCondiments" method="post">
  <label><input type="checkbox" name="condiment" value="Lettuce"> Lettuce</label>
  <label><input type="checkbox" name="condiment" value="Tomato"> Tomato</label>
  <label><input type="checkbox" name="condiment" value="Mustard"> Mustard</label>
  <label><input type="checkbox" name="condiment" value="Sprouts"> Sprouts</label>
  <br><br>
  <input type="submit" value="Save">
</form>
</body>
</html>