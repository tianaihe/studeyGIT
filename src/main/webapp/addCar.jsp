<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>车辆添加</h2>
<form action="/car/AddServlet" method="post">
车辆号码：<input  type="text" placeholder="请输入车辆号码" name="number">
车辆品牌：<input  type="text" placeholder="请输入车辆品牌" name="brand">
车辆价格：<input  type="text" placeholder="请输入车辆价格" name="price">
     <input type="submit" value="提交添加车辆">
</form>
</body>
</html>
