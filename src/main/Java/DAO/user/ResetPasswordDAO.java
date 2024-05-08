package DAO.user;

import DAO.CloseConnection;
import DAO.GetConnection;
import Model.Account;

import java.sql.*;

public class ResetPasswordDAO extends GetConnection{
    CloseConnection close=new CloseConnection();
    public boolean checkTenDangNhap(String tdn){
        Connection con= new GetConnection().getConnection();
        String sql="select * from taikhoanphuhuynh where TenDangNhap=?";
        PreparedStatement pr=null;
        ResultSet rs=null;
        if(con!=null)
        {
            try
            {
                pr=con.prepareStatement(sql);
                pr.setString(1,tdn);
                rs=pr.executeQuery();
                if(rs.next())
                {
                    return true;
                }
                return false;

            }catch (SQLException e)
            {
                e.printStackTrace();
                return false;
            }finally {
                close.dongKetNoi(con,pr,rs);
            }
        }
        return false;
    }

    public Account resetPassword(Account a){
        Connection con=getConnection();
        String sql1="update taikhoanphuhuynh set MatKhau = ? where TenDangNhap=?";
        PreparedStatement pr=null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql1);
                pr.setString(2,a.getTendangnhap());
                pr.setString(1,a.getMatkhau());

                pr.executeUpdate();

                return a;
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }
            finally {

            }
        }
        return null;
    }
}
