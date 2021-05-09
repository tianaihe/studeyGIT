
<%@ page import="domain.Car" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>

<style>
.ok{
    color: mediumvioletred;
}
.nook{
    color: red;
    }
</style>

<head>
    <title></title>
</head>
<script>
    function delectCar(cid,number) {
        if(confirm("您确定删除车号"+number+"这条记录吗?")){
            alert(cid);
            //document.getElementById("delectcar").onsubmit();
            //yes=true
           window.location.href="DelectServlet?cid="+cid ;//todo 怎么老是传到dopost,参数无法传递。。。。。不知道哪里有问题，修改也无法跳转页面。。。
           //location.href="DelectServlet?cid="+cid ;//
         /*   $.post({
                url
                }*/



        }
    }
    function updateCar(cid) {//根据cid修改
        window.location.href="UpdateServlet?cid="+cid

    }
    //todo 假装弄了一个修改的方法

</script>
<body>
<table border="1" cellspacing="1">
<tr>
    <th>车辆号码</th>
    <th>车辆品牌</th>
    <th>车辆价格</th>
    <th>操作</th>
</tr>
<%List<Car> listCar =( List<Car>)request.getAttribute("listCar");%><%--jstl表达式和jar包冲突无法导入。。。。所以循环的el没写出来--%>
   <%-- <c:forEach items="${listCar}" var="carone" varStatus="aaa">--%>
    <% for(Car car:listCar ){%>

<tr>
    <td><%=car.getNumber()%></td>

    <td><%=car.getBrand()%></td>

    <td
   <%-- <% if(car.getPrice()>100000)
        System.out.print("class=\"ok\"");
        else{
        System.out.print("class=\"nook\"");
    }
    %>--%>><%=car.getPrice()%>
     <%--   <%for (Car car1:listCar){%>
         <%if (car1.getPrice()>100000){%>

        <script>
       /* function car () {*/
            document.getElementById("color").setAttribute("class","nook")
           // document.getElementById("color").setAttribute("class","nook")
          /*  document.getElementsByTagName("ok").class="nook"*/
       /* }
        car();*/
    </script><%}%>--%>
      <%-- <% }%>
--%>
      <%--  <script>document.getElementsByTagName("ok").class="nook"</script>--%>
    </td>
    <td >

    <input type="button" value="删除" onclick="delectCar(<%=car.getCid()%>,'<%=car.getNumber()%>');"><%--有一个Uncaught ReferenceError:解决方法加上‘’号，否则他以为是变量--%>
        <button href="updateCar.jsp" onclick="updateCar(<%=car.getCid()%>)">修改</button>
    </td>


 <%--   ${aaa.end}
    ${carone}--%>
<%--    <th>${listCar[0].number}</th>
    <th>${listCar[0].brand}</th>
    <th>${listCar[0].price}</th>--%>
</tr>
  <%--  </c:forEach>--%>
    <%}%>
</table>
</body>
</html>
