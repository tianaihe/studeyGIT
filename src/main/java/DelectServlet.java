import service.IDelectCar;
import service.impl.IDelectCarImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DelectServlet")
public class DelectServlet extends HttpServlet {

    IDelectCar  iDelectCar=new IDelectCarImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cid = Integer.parseInt(request.getParameter("cid"));//todo 要用getparameter而不是attribute。。。。。。？
       // System.out.println(cid);
        //  int cid2 = Integer.parseInt(request.getParameter("ciddd"));
       // System.out.println(cid2);
    /*    Object ciddd = request.getAttribute("ciddd");
       String cidd= (String) ciddd;
       int cid2=Integer.parseInt(cidd);*/
        //int cid1 = Integer.parseInt((String) request.getSession().getAttribute("cid")) ;
    /*    String method = request.getMethod();
        if("POST".equals(method)){*/
   // int cid2=5;
       iDelectCar.delectCar(cid);

        //int cid1 = Integer.parseInt(request.getAttribute("cid"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
