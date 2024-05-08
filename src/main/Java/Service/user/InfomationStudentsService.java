package Service.user;

import DAO.user.InfomationStudentsDAO;
import Model.Students;

import java.util.List;

public class InfomationStudentsService {
    public List<Students> thongtin(String session)
    {
        return (new InfomationStudentsDAO().thongtin(session));
    }

    public Students suathongtin(int id,Students a)
    {
        return (new InfomationStudentsDAO().sua(id,a) );
    }

    public Students laythongtinbyid(int id , String session)
    {
        return (new InfomationStudentsDAO().thongTinDuaVaoId(id,session));
    }
}
