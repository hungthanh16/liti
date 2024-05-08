package Controller.Api.user;

import Model.Account;
import Model.Parents;
import Service.user.InfomationParentService;
import Utils.HttpUtils;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/api-thongtinphuhuynh")
public class ParentInformationAPI extends HttpServlet {

    InfomationParentService info=new InfomationParentService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value=(String)req.getSession().getAttribute("tendangnhap");
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
            if(value!=null)
            {
                Parents account=info.thongTinPhuHuynh(value);
                mapper.writeValue(resp.getOutputStream(),account);
                System.out.print("Xuat du lieu thanh cong");
            }
            else
            {
                System.out.print("Xuat du lieu khong thanh cong");
                req.getSession().invalidate();
            }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value=(String)req.getSession().getAttribute("tendangnhap");
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        Parents pa= HttpUtils.of(req.getReader()).toModel(Parents.class);
        if(value!=null)
        {
            if(info.suaThongTin(value,pa)==true)
            {
                System.out.print("Sua thanh cong");
            }
            else
            {
                System.out.print("Sua khong thanh cong");
            }
        }
        else
        {
            System.out.print("Khong the sua");
        }
    }
}
