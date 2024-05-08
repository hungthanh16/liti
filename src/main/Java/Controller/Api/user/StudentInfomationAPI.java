package Controller.Api.user;

import Model.Students;
import Service.user.InfomationParentService;
import Service.user.InfomationStudentsService;
import Utils.HttpUtils;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value="/api-thongtinhocsinh")
public class StudentInfomationAPI extends HttpServlet {

    InfomationStudentsService service=new InfomationStudentsService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        String value=(String)req.getSession().getAttribute("tendangnhap");
        if(value!=null)
        {
            String id=req.getParameter("id");
            if(id==null) {
                List<Students> a = service.thongtin(value);
                if (a != null) {
                    mapper.writeValue(resp.getOutputStream(), a);
                    System.out.print("Xuat du lieu thanh cong");
                } else {
                    System.out.print("Xuat du lieu khong thanh cong");
                }
            }
            else
            {
                Students a=service.laythongtinbyid(Integer.parseInt(id),value);
                if (a != null) {
                    mapper.writeValue(resp.getOutputStream(), a);
                    System.out.print("Xuat du lieu thanh cong");
                } else {
                    System.out.print("Xuat du lieu khong thanh cong");
                }
            }
        }
        else
        {
            req.getSession().removeAttribute("tendangnhap");
            req.getSession().invalidate();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");


        String value=(String)req.getSession().getAttribute("tendangnhap");
        Students get = HttpUtils.of(req.getReader()).toModel(Students.class);

        if(value!=null)
        {
            String id=req.getParameter("id");
            Students a = service.suathongtin(Integer.parseInt(id),get);
            if(a != null)
            {
                mapper.writeValue(resp.getOutputStream(),a);
                System.out.print("Sua du lieu thanh cong");
            }
            else
            {
                System.out.print("Sua du lieu khong thanh cong");
            }
        }
        else{
            req.getSession().removeAttribute("tendangnhap");
            req.getSession().invalidate();
        }

    }
}
