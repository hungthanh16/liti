package DAO.user;

import DAO.CloseConnection;
import DAO.GetConnection;
import Mapper.ModelMapper;

import Model.DetailsContract;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DetailsContractDAO extends GetConnection {
    CloseConnection close=new CloseConnection();
    public boolean themChiTietHopDong(DetailsContract a) throws ParseException{
        Connection con = getConnection();
        String sql = "insert into chitiethopdong(ThuTrongTuan,Buoi,idHopDong) values(?,?,?)";
        PreparedStatement pr = null;

        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setInt(1,a.getThutrongtuan());
                pr.setString(2,a.getBuoi());
                pr.setInt(3,a.getIdhopdong());
                if(pr.executeUpdate() > 0)
                {
                    return true;
                }
                else{
                    return false;
                }
            }catch (SQLException e)
            {
                e.printStackTrace();
                return false;
            }finally {
                close.dongKetNoi(con,pr);
            }
        }
        return false;
    }
}
