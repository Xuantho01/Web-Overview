<%--
  Created by IntelliJ IDEA.
  User: XuanTho
  Date: 4/7/2020
  Time: 9:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculate Discount</title>
  </head>
  <body>
  <h1>Product Discount Calculator</h1>
  <form action="discount" method="post" style="border: 1px solid; width: 330px; height: 137px">
    <table>
      <tr>
        <td>Product description:</td>
      </tr>
      <tr>
        <td>Price:</td>
        <td><input type="text" name="price" placeholder="Enter Price"></td>
      </tr>
      <tr>
        <td>Discount Percent:</td>
        <td><input type="text" name="percent" placeholder="Enter percent"></td>
      </tr>
      <tr>
        <td>Discount Amount:</td>
        <td><input type="text" name="amount" placeholder="Enter Amount"></td>
      </tr>
      <tr>
        <td>Discount Price:</td>
        <td><input type="text" name="discount" placeholder="Enter discount">
        </td>
      </tr>
    </table>
    <input type="submit" value="CHECK">
  </form>
  </body>
</html>
