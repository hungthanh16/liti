package Service.user;

import DAO.user.LoginDAO;
import Model.Account;
import Model.InFoAccount;
import Model.Parents;

public class LoginService {

    public boolean kiemTraTaiKhoan(Account a)
    {
        if(new LoginDAO().dangNhap(a) != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String phanQuyen(Account a)
    {
        return (new LoginDAO().getPhanQuyen(a));
    }

    public InFoAccount thongTin(Account a)
    {
        return (new LoginDAO().dangNhap(a));
    }

    public String TenDangNhap (Account a)
    {
        return ( new LoginDAO().layTenDangNhap(a));
    }
}
