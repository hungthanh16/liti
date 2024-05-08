package Service.user;
import DAO.user.InformationContractDAO;
import Model.Contract;

import java.text.ParseException;
import java.util.List;
public class InformationContractService {
    public List<Contract> xemThongTinHopDong(String session) throws ParseException
    {
        return (new InformationContractDAO().xemHopDong(session));
    }
}
