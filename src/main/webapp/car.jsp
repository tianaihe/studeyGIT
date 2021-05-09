<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>

<html>
<head>
    <title></title>
</head>
<body>
<h3>车辆回收</h3>
<form action="${pageContext.request.contextPath}/CarServlet" method="post">
召回车辆数量：<input name="number" placeholder="请输入回收数量" type="text">
    <input type="submit" value="提交">
</form>
<form action="addCar.jsp">
    <input type="submit" value="添加车辆">
</form>

</body>
</html>
