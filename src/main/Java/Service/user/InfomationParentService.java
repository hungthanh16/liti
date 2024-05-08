package Service.user;

import Model.Account;
import DAO.user.*;
import Model.Parents;

public class InfomationParentService {
    public Parents thongTinPhuHuynh(String session)
    {
        InformationParentDAO pr=new InformationParentDAO();
        return (pr.xuatThongTinPhuHuynh(session));
    }

    public Boolean suaThongTin(String session,Parents a)
    {
        return(new InformationParentDAO().suaThongTinPhuHuynh(session,a));
    }
}
