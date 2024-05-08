package Controller.Api.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/api-dangxuat")
public class LogoutAPI  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value=(String) req.getSession().getAttribute("tendangnhap");
        if(value!=null)
        {
            req.getSession().removeAttribute("tendangnhap");
            req.getSession().invalidate();
            System.out.print("Dang xuat thanh cong");
        }
    }
}
