package Controller.Api.user;

import Model.Students;
import Service.user.AddNewStudentsService;
import Utils.HttpUtils;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/api-themhocsinh")
public class AddNewStudentsAPI extends HttpServlet {

    AddNewStudentsService service = new AddNewStudentsService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        Students a= HttpUtils.of(req.getReader()).toModel(Students.class);

        String value=(String)req.getSession().getAttribute("tendangnhap");

        if(value!=null)
        {
            if(service.themhocsinh(value,a)!=null)
            {
                mapper.writeValue(resp.getOutputStream(),a);
                System.out.print("Them hoc sinh thanh cong");
            }
            else
            {
                System.out.print("Them hoc sinh that bai");

            }
        }
        else
        {
            req.getSession().invalidate();
        }

    }
}
