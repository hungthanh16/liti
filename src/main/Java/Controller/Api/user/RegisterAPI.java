package Controller.Api.user;

import Model.Account;
import Model.Parents;
import Service.user.AddAcountService;
import Utils.HttpUtils;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value="/api-dangky")
public class RegisterAPI extends HttpServlet {

    AddAcountService add=new AddAcountService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        Account a=HttpUtils.of(req.getReader()).toModel(Account.class);
        if(add.kiemTraTaiKhoan(a.getTendangnhap())==false)
        {
            if(add.themTaiKhoan(a)==true)
            {
                mapper.writeValue(resp.getOutputStream(),a);
                System.out.print("Đăng ký thành công");
                session.setAttribute("next",a.getTendangnhap());
            }
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        Parents a=HttpUtils.of(req.getReader()).toModel(Parents.class);
        String value=(String)req.getSession(false).getAttribute("next");

        if(value!=null)
        {
            a.setTendangnhap(value);
            if(add.themPhuyHuynh(a)!=null)
            {
                System.out.print("Xac thuc thong tin thanh cong");
                mapper.writeValue(resp.getOutputStream(),a);
            }
            else{
                System.out.print("Xac thuc khong thong tin thanh cong");
            }
            req.getSession(false).removeAttribute("next");
            req.getSession(false).invalidate();
        }
        else
        {
            req.getSession(false).removeAttribute("next");
            req.getSession(false).invalidate();
        }
    }
}
