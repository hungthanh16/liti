package Controller.Api.user;
import Model.Contract;
import Service.user.AddNewContractService;
import Utils.HttpUtils;
import org.codehaus.jackson.map.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(value="/api-dangkyhopdong")
public class AddNewContractAPI extends HttpServlet {
    AddNewContractService service = new AddNewContractService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ObjectMapper mapper=new ObjectMapper();
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        Contract a = HttpUtils.of(req.getReader()).toModel(Contract.class);

        if(service.themHopDong(a)!=null)
        {
            mapper.writeValue(resp.getOutputStream(),a);
            System.out.print("Them hop dong thanh cong");
        }
        else {
            System.out.print("Them hop dong that bai");
        }


    }
}
