import domain.Car;
import service.ICarService;
import service.impl.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
   ICarService ic= new CarServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int cid=Integer.parseInt(request.getParameter("cid")) ;

        Car car = ic.selectOne(cid);
        request.setAttribute("listCar2",car);
        request.setAttribute("cid",cid);
        //根据cid获取数据后，用转发到修改页面
        request.getRequestDispatcher("updateCar.jsp").forward(request,response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
