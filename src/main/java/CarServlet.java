import domain.Car;
import service.AddService;
import service.ICarService;
import service.impl.CarServiceImpl;
import util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
    private ICarService ic=new CarServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
       int num=Integer.parseInt(number);
        System.out.println(number);
        List<Car> cars = ic.selectCar(num);//查出来的放在这个集合中
        request.setAttribute("listCar",cars);
        request.getRequestDispatcher("returnPage.jsp").forward(request,response);//请求转发，有数据传送，无数据传送用重定向
        //request.getRequestDispatcher("/")
        

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
