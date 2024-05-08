package DAO.user;

import DAO.GetConnection;
import Model.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentsDAO extends GetConnection {

    public Students themThongTin(String tendangnhap,Students hocsinh)
    {
        Connection con=getConnection();
        String sql="insert into hocsinh(ho,ten,gioitinh,ngaysinh,truong,lop,tendangnhap) values(?,?,?,?,?,?,?)";
        PreparedStatement pr=null;
        if(con!=null)
        {
            try {
                pr=con.prepareStatement(sql);
                pr.setString(1,hocsinh.getHo());
                pr.setString(2,hocsinh.getTen());
                pr.setString(3,hocsinh.getGioitinh());
                pr.setString(4,hocsinh.getNgaysinh());
                pr.setString(5,hocsinh.getTruong());
                pr.setString(6,hocsinh.getLop());
                pr.setString(7,tendangnhap);

                if(pr.executeUpdate() > 0)
                {
                    return hocsinh;
                }
                else
                {
                    return null;
                }
            }catch (SQLException e){
                    e.printStackTrace();
                    return null;
            }
            finally {
                try {
                    if(con!=null)
                    {
                        con.close();
                    }
                    if(pr!=null)
                    {
                        pr.close();
                    }
                }catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }


}
