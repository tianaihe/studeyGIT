import domain.Car;
import service.UpdateCar;
import service.impl.UpdateCarImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UpdateCarServlet")
public class UpdateCarServlet extends HttpServlet {
        UpdateCar updateCar=new UpdateCarImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        int cid = Integer.parseInt(request.getParameter("cid"));//
        String number= request.getParameter("number");
        String brand=request.getParameter("brand");
        int price = Integer.parseInt(request.getParameter("price"));
        updateCar.updateCar(cid,number,brand,price);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
