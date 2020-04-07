<%--
  Created by IntelliJ IDEA.
  User: XuanTho
  Date: 4/7/2020
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Convert Money</title>
  </head>
  <body>
  <form action="convert" method="post">
    <div>
      <label>Rate: </label><br/>
      <input type="number" name="rate" placeholder="Enter rate" value="22000"><br/>
      <label>USD: </label><br/>
      <input type="number" name="usd" placeholder="Enter USD" value="0"><br/>
      <input type="submit" id="submit" value="Converter">
    </div>
  </form>
  </body>
</html>
