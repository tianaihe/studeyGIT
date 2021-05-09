<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="domain.Car" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title></title>
</head>
<body>
<table border="1" cellspacing="1">

       <%-- <%Car car = (Car) request.getAttribute("listCar2");%>--%>
    <%-- <c:forEach items="${listCar}" var="carone" varStatus="aaa">--%>
      <%--  <% for(Car car:listCar ){%>--%>

<form action="/car/UpdateCarServlet" method="post" >
        <%--车辆id：<span name="cid" value="<%=car.getCid()%>"><%=car.getCid()%></span>--%><%--可以优化正则表达式--%>
        车辆id：<input readonly="readonly"name="cid" value="${listCar2.cid}">
        车辆号码：<input name="number" value="${listCar2.number}" >
        车辆品牌：<input name="brand" value="${listCar2.brand}">
        车辆价格：<input name="price" value="${listCar2.price}<%--<%=car.getPrice()%>--%>" >
                <input type="submit" value="修改">
</form>
    <%--    <%}%>--%>
</body>
</html>
