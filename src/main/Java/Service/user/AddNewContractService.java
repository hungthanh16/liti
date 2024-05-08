package Service.user;
import DAO.user.ContractDAO;
import Model.Contract;
public class AddNewContractService {
    public Contract themHopDong(Contract a){
        try{
            return (new ContractDAO().themHopDong(a));
        }catch(Exception e)
        {

            e.printStackTrace();
            return null;
        }
    }
}