import service.AddService;
import service.impl.AddServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    AddService addService=new AddServiceimpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String number = request.getParameter("number");
        String brand = request.getParameter("brand");
       int price = Integer.parseInt(request.getParameter("price"));
       addService.addCar(number,brand,price);
    }

    /*public void delectCar(int cid) {

    }*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
