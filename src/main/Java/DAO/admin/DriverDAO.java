package DAO.admin;

import DAO.CloseConnection;
import DAO.GetConnection;
import Model.Driver;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DriverDAO {
    CloseConnection close=new CloseConnection();
    public boolean checkCCCD(String cccdkt){
        Connection con= new GetConnection().getConnection();
        String sql="select * from taixe where CCCD=?";
        PreparedStatement pr=null;
        ResultSet rs=null;
        if(con!=null)
        {
            try
            {
                pr=con.prepareStatement(sql);
                pr.setString(1,cccdkt);
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

    public Driver themTaiXe(Driver a)throws ParseException {
        Connection con = new GetConnection().getConnection();
        String sql = "insert into taixe() values(?,?,?,?,?,?,?)";
        PreparedStatement pr = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        if(con!=null)
        {
            try {
                Date ngayThang = sdf.parse(a.getNgaysinh());
                java.sql.Date ngayThangSQL = new java.sql.Date(ngayThang.getTime());
                pr=con.prepareStatement(sql);
                pr.setString(1,a.getCccd());
                pr.setString(2,a.getHo());
                pr.setString(3,a.getTen());
                pr.setString(4,a.getGioitinh());
                pr.setDate(5,ngayThangSQL);
                pr.setString(6,a.getEmail());
                pr.setString(7,a.getSdt());

                if(pr.executeUpdate() > 0)
                {
                    return a;
                }
                else{
                    return null;
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
                return null;
            }finally {
                close.dongKetNoi(con,pr);
            }
        }
        return null;
    }
}
