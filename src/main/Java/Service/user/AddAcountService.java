package Service.user;

import DAO.user.AccountCreationDAO;
import Model.Account;
import Model.Parents;

public class AddAcountService {
    public boolean kiemTraTaiKhoan(String a)
    {
        return (new AccountCreationDAO().kiemTraTaiKhoan(a));
    }
    public boolean kiemtraEmail(String email)
    {
        return (new AccountCreationDAO().kiemTraEmail(email));
    }
    public  boolean kiemTraSDT(String sdt)
    {
        return(new AccountCreationDAO().kiemTraSDT(sdt));
    }

    public boolean themTaiKhoan(Account a)
    {
        return ( new AccountCreationDAO().themTaiKhoan(a));
    }

    public Parents themPhuyHuynh(Parents a)
    {
        try {
            return (new AccountCreationDAO().themThongTinPhuHuynh(a));
        }catch (Exception e)
        {

            e.printStackTrace();
            return null;
        }

    }
}
